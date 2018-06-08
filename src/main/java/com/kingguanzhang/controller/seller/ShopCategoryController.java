package com.kingguanzhang.controller.seller;

import com.kingguanzhang.dto.Msg;
import com.kingguanzhang.pojo.ShopCategory;
import com.kingguanzhang.service.ShopCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShopCategoryController {

    @Autowired
    ShopCategoryService shopCategoryService;

    @RequestMapping("/ajax/shopCategory")
    @ResponseBody
    public Msg getDepts(){
        List<ShopCategory> shopCategoryList = shopCategoryService.getShopCategorys();

        return Msg.success().add("shopCategorys",shopCategoryList);
    }
}
