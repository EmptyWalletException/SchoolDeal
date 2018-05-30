package com.kingguanzhang.controller.shopAdmin;

import com.kingguanzhang.dto.Msg;
import com.kingguanzhang.pojo.ProductCategory;
import com.kingguanzhang.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
