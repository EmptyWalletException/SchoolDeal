package com.kingguanzhang.controller.shopAdmin;

import com.kingguanzhang.pojo.LocalAuth;
import com.kingguanzhang.pojo.Shop;
import com.kingguanzhang.service.LocalAuthService;
import com.kingguanzhang.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class JumpToJspPage {

    @Autowired
    private LocalAuthService localAuthService;

    @Autowired
    private ShopService shopService;

    @RequestMapping("/index")
    public String showIndex(){
        return "/shop/index";
    }

    @RequestMapping("/register")
    public String showRegister(){
        return "/shop/registerShop";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showLogin(){
        return "/shop/login";
    }

    @RequestMapping("/editShop")
    public String showEditShop(){
        return "/shop/editShop";
    }

    @RequestMapping("/registerUser")
    public String showRegisterUser(){
        return "/shop/registerUser";
    }

    /**
     * 跳转到后台管理首页的方法,需要在此时就在session中写入shopId,后期会改到登录时写入;
     * @param request
     * @return
     */
    @RequestMapping("/shopManagement")
    public String showShopManagement(HttpServletRequest request){
        //在登录时就需要在session中写入相关信息,这里再取出来
        String username = (String) request.getSession().getAttribute("username");
        //虽然返回的是一个列表,但其实只会查询到一个值;

        //TO-DO
        username = "admin";//因为这里调试时发现session中没有取到值,需要后期去自定义security登录成功后的控制层实现写入session;

        List<LocalAuth>  localAuthList= localAuthService.getLocalAuthByLoginUsername(username);
        Integer userId = localAuthList.get(0).getUserId();

        Shop shop = shopService.getShopByUserId(userId);
        request.getSession().setAttribute("shopId",shop.getShopId());
        return "/shop/shopManagement";
    }

    @RequestMapping("/productManagement")
    public String showProductManagement(){
        return "/shop/productManagement1";
    }

    @RequestMapping("/productManagement2")
    public String showProductManagement2(){
        return "/shop/productManagement2";
    }

    @RequestMapping("/productCategory")
    public String showProductCategory(){
        return "/shop/productCategory";
    }

    @RequestMapping("/addProduct")
    public String addProduct(){
        return "/shop/addProduct";
    }


}
