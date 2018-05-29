package com.kingguanzhang.controller.shopAdmin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingguanzhang.dto.Msg;
import com.kingguanzhang.dto.ShopExecution;
import com.kingguanzhang.pojo.Shop;
import com.kingguanzhang.service.ShopService;
import com.kingguanzhang.util.RequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

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

    @RequestMapping(value = "/addShop",method = RequestMethod.POST)
    @ResponseBody
    private Msg registerShop(HttpServletRequest request) {

        //从前端传来的请求中获取键为shopStr的值;
        String shopStr = RequestUtil.parserString(request, "shopStr");
        ObjectMapper objectMapper = new ObjectMapper();
        Shop shop = null;

        try {
            //将前端传来的商店信息转换为shop实体类;
            System.out.print("shopStr的值是:" + shopStr);
            shop = objectMapper.readValue(shopStr, Shop.class);
        } catch (Exception e) {
            e.printStackTrace();
            Msg msg = Msg.fail();
            msg.setMsg("设置店铺信息失败!");
            return msg;
        }

        //从request中解析出上传的文件图片;
        CommonsMultipartFile shopImg = null;
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        if (commonsMultipartResolver.isMultipart(request)) {
            MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
            shopImg = (CommonsMultipartFile) multipartHttpServletRequest.getFile("shopImg");
        } else {
            Msg msg = Msg.fail();
            msg.setMsg("设置店铺图片信息时发生错误!");
            return msg;
        }

        //注册店铺,尽可能的减少从前端获取的值;
        if (null != shop && null != shopImg) {

            shop.setOwnerId(1);//这个店铺主人id本应该是从前端传过来的session中获取,但是暂时还不会;


            ShopExecution shopExecution = null;
            try {
               //使用文件.getOriginalFilename可以获取带后缀.jpg的全名;或者文件.getItem.getName也可以获取带后缀的文件名;否则只能取到不带后缀的文件名;
                shopExecution = shopService.addShop(shop, shopImg.getInputStream(), shopImg.getOriginalFilename());
            } catch (IOException e) {
                System.out.print(e.getMessage());
                Msg msg = Msg.fail();
                msg.setMsg("图片保存出错了");
                return msg;
            }
            //返回注册店铺的最终结果;
            Msg msg = Msg.success();
            msg.setMsg("注册成功");
            return msg;

        } else {

            Msg msg = Msg.fail();
            msg.setMsg("注册失败,店铺信息不完整!");
            return msg;
        }
    }


}
