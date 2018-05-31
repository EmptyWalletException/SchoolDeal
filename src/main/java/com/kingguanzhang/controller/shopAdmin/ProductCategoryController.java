package com.kingguanzhang.controller.shopAdmin;

import com.kingguanzhang.dto.Msg;
import com.kingguanzhang.pojo.ProductCategory;
import com.kingguanzhang.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping("/ajax/productCategory")
    @ResponseBody
    public Msg getCategory(){
       List<ProductCategory> productCategoryList = productCategoryService.getCategory();
       return  Msg.success().setMsg("获取分类成功").add("productCategoryList",productCategoryList);
    }


    @RequestMapping("/ajax/addProductCategory")
    @ResponseBody
    public Msg addProductCategroy(@RequestParam("productCategoryName") String name, HttpServletRequest request){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setProductCategoryName(name);
        productCategory.setCreateTime(new Date(System.currentTimeMillis()));
        //shopId为了安全只能从session中获取
        Integer shopId = (Integer)request.getSession().getAttribute("shopId");
        if (null == shopId) {
           return Msg.fail().setMsg("距离上次操作已超过30分钟,或未能获取店铺信息");
        }
        productCategory.setShopId(shopId);
        productCategory.setPriority(7);
        //分类id由数据库自增;
        Integer integer = productCategoryService.addProductCategroy(productCategory);
        if (integer >0){

        return  Msg.success().setMsg("创建分类成功");
        }
        return Msg.fail().setMsg("创建分类失败");
    }

}
