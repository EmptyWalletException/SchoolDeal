package com.kingguanzhang.controller.shopAdmin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingguanzhang.dto.Msg;
import com.kingguanzhang.pojo.Product;

import com.kingguanzhang.service.ProductService;
import com.kingguanzhang.util.RequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class ProductManagementController {


    @Autowired
    private ProductService productService;

    @RequestMapping("/productManagement")
    public String showProductManagement(){
        return "/shop/productManagement1";
    }

    @RequestMapping("/productManagement2")
    public String showProductManagement2(){
        return "/shop/productManagement2";
    }

    @RequestMapping("/showEditProduct/{productId}")
    public String showEditProduct(@PathVariable("productId") Integer productId, HttpServletRequest request){
        request.getSession().setAttribute("productId",productId);
        return "shop/editProduct";
    }

    @RequestMapping(value = "/getProductList")
    @ResponseBody
    public Msg getProductList(@RequestParam("shopId") Integer shopId){
        System.out.print("jinru");
        List<Product> productList = productService.getProductList(shopId);
        return Msg.success().setMsg("获取商品集合成功").add("productList",productList);
    }

    @RequestMapping(value = "/getProduct")
    @ResponseBody
    public Msg getProduct( HttpServletRequest request){
        //从session中获取商品Id,页面和js中也不要暴露商品id,防止用户修改id
        Integer productId = (Integer)request.getSession().getAttribute("productId");
        Product product = productService.getProduct(productId);
        return Msg.success().setMsg("获取商品集合成功").add("product",product);
    }

    /**
     * 更新商品信息
     * @param request
     * @return
     */
    @RequestMapping(value = "/updateProduct",method = RequestMethod.POST)
    @ResponseBody
    public Msg updateProduct(HttpServletRequest request) {

        //从前端传来的请求中获取键为productStr的值;
        String productStr = RequestUtil.parserString(request, "productStr");
        ObjectMapper objectMapper = new ObjectMapper();
        Product product = null;

        try {
            //将前端传来的商品信息转换为product实体类;
            System.out.print("productStr的值是:" + productStr);
            product = objectMapper.readValue(productStr, Product.class);

            /*这里需要注意,productId需要小心处理,建议页面上一步查询时就写入session,防止用户在前端修改id导致处理了错误的数据;*/
            int productId = (int)request.getSession().getAttribute("productId");//从session中取出商品id
            product.setProductId(productId);

        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail().setMsg("商品信息不能正确解析");
        }

        //从request中解析出上传的文件图片;
        CommonsMultipartFile productImg = null;
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        if (commonsMultipartResolver.isMultipart(request)) {
            MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
            productImg = (CommonsMultipartFile) multipartHttpServletRequest.getFile("productImg");
        } else {
            return Msg.fail().setMsg("图片文件解析失败");
        }

        //判断是否需要更新图片;
        if (null != productImg) {
            try {
                //使用文件.getOriginalFilename可以获取带后缀.jpg的全名;或者文件.getItem.getName也可以获取带后缀的文件名;否则只能取到不带后缀的文件名;
                productService.addProduct(product, productImg.getInputStream(), productImg.getOriginalFilename());
            } catch (IOException e) {
                System.out.print(e.getMessage());
                return Msg.fail().setMsg("更新商品信息失败");
            }
        }
        int i = productService.updateProduct(product);
        if (i >= 0){
            product =productService.getProduct(product.getProductId());
            return Msg.success().setMsg("更新商品成功").add("product",product);
        }
        return Msg.fail().setMsg("更新商品信息失败");
    }

}
