package com.kingguanzhang.controller.shopAdmin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingguanzhang.dto.ShopExecution;
import com.kingguanzhang.pojo.Shop;
import com.kingguanzhang.service.ShopService;
import com.kingguanzhang.util.RequestUtil;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Controller
/*@RequestMapping("/shopadmin")*/
public class ShopManagementController {

    @Autowired
    private ShopService shopService;

    @RequestMapping("/index")
    public String showIndex(){
        return "shop/index";
    }

    @RequestMapping("/register")
    public String showRegister(){
        return "/shop/registerShop";
    }

    @RequestMapping("/login")
    public String showLogin(){
        return "/shop/login";
    }

    private Map<String, Object> registerShop(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<>();

        //从前端传来的请求中获取键为shopStr的值;
        String shopStr = RequestUtil.parserString(request, "shopStr");
        ObjectMapper objectMapper = new ObjectMapper();
        Shop shop = null;

        try {
            //将前端传来的商店信息转换为shop实体类;
            shop = objectMapper.readValue(shopStr, Shop.class);
        } catch (Exception e) {
            modelMap.put("success", false);
            modelMap.put("errMsg", e.getMessage());
            return modelMap;
        }

        //从request中解析出上传的文件图片;
        CommonsMultipartFile shopImg = null;
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        if (commonsMultipartResolver.isMultipart(request)) {
            MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
            shopImg = (CommonsMultipartFile) multipartHttpServletRequest.getFile("shopImg");
        } else {
            modelMap.put("success", false);
            modelMap.put("errMsg", "需要上传一张图片");
            return modelMap;
        }

        //注册店铺,尽可能的减少从前端获取的值;
        if (null != shop && null != shopImg) {

            shop.setOwnerId(1);//这个店铺主人id本应该是从前端传过来的session中获取,但是暂时还不会;

            DiskFileItem fi = (DiskFileItem) shopImg.getFileItem();
            File shopImgFile = fi.getStoreLocation();
           ShopExecution shopExecution = shopService.addShop(shop, shopImgFile);
            //返回注册店铺的最终结果;
            modelMap.put("success", true);
            modelMap.put("shopExecution", shopExecution);
            return modelMap;

        } else {
            modelMap.put("success", false);
            modelMap.put("errMsg", "注册店铺失败,店铺信息不完整!");
            return modelMap;
        }
    }


}
