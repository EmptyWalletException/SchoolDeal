package com.kingguanzhang.controller.common;

import com.kingguanzhang.pojo.LocalAuth;
import com.kingguanzhang.pojo.Shop;
import com.kingguanzhang.service.LocalAuthService;
import com.kingguanzhang.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
        return "common/index";
    }


    /**
     * 跳转到登录页
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String showLogin(){
        return "common/login";
    }

    /**
     * 跳转到注册页面
     * @return
     */
    @RequestMapping("/register/registerUser")
    public String showRegisterUser(){
        return "common/registerUser";
    }

    /**
     * 跳转到店铺详情页;用get方式;
     * @return
     */
    @RequestMapping("/common/shopDetails/{shopId}")
    public String showShopDetails(@PathVariable("shopId") Integer shopId,HttpServletRequest request){
        request.getSession().setAttribute("shopId",shopId);
        return "common/shopDetails";
    }

    //以下是卖家后台管理页面跳转的方法;
    @RequestMapping("/register")
    public String showRegister(){
        return "seller/registerShop";
    }

    @RequestMapping("/editShop")
    public String showEditShop(){
        return "seller/editShop";
    }

    @RequestMapping("/productManagement")
    public String showProductManagement(){
        return "seller/productManagement1";
    }

    @RequestMapping("/productManagement2")
    public String showProductManagement2(){
        return "seller/productManagement2";
    }

    @RequestMapping("/addProduct")
    public String addProduct(){
        return "seller/addProduct";
    }

    /**
     * 跳转到卖家后台管理首页的方法,需要在此时就在session中写入shopId,后期会改到登录时写入;
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
        //通过用户账号名得到店铺Id
        List<LocalAuth>  localAuthList= localAuthService.getLocalAuthByLoginUsername(username);
        Integer userId = localAuthList.get(0).getUserId();

        Shop shop = shopService.getShopByUserId(userId);
        request.getSession().setAttribute("shopId",shop.getShopId());
        return "seller/shopManagement";
    }

    //以下是管理员的页面跳转
    @RequestMapping("/admin/shopManagement")
    public String showAdminShopManagement(){
        return "admin/shopManagement";
    }

    @RequestMapping("/admin/productCategoryManagement")
    public String showAdminProductCategory(){
        return "admin/productCategoryManagement";
    }

    @RequestMapping("admin/editShop")
    public String showAdminEditShop(){
        return "admin/editShop";
    }



}
