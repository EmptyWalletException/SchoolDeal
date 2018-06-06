package com.kingguanzhang.controller.shopAdmin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingguanzhang.dto.Msg;
import com.kingguanzhang.pojo.LocalAuth;
import com.kingguanzhang.pojo.PersonInfo;
import com.kingguanzhang.pojo.RoleLocalauth;
import com.kingguanzhang.service.LocalAuthService;
import com.kingguanzhang.service.PersonInfoService;
import com.kingguanzhang.service.RoleLocalauthService;
import com.kingguanzhang.util.RequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PersonInfoController {

    @Autowired
    private LocalAuthService localAuthService;

    @Autowired
    private PersonInfoService personInfoService;

    @Autowired
    private RoleLocalauthService roleLocalauthService;

    @RequestMapping(value = "/registerUser",method = RequestMethod.POST)
    @ResponseBody
    public Msg registerUser(HttpServletRequest request){
        LocalAuth localAuth = null;
        PersonInfo personInfo = null;
        RoleLocalauth roleLocalauth = new RoleLocalauth();
        ObjectMapper objectMapper = new ObjectMapper();

        //将request中的Jason转成字符串
        String localAuthStr = RequestUtil.parserString(request,"localAuth");
        String personInfoStr = RequestUtil.parserString(request,"personInfo");

        System.out.println(localAuthStr);
        System.out.println(personInfoStr);

        try {
            localAuth = objectMapper.readValue(localAuthStr,LocalAuth.class);
            personInfo = objectMapper.readValue(personInfoStr,PersonInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail().setMsg("设置账号信息失败!");
        }

        if (null != localAuth && null != personInfo) {
            if ("" != localAuth.getUsername().trim() && "" != localAuth.getPassword().trim() &&
                    "" != personInfo.getEmail().trim() && "" != personInfo.getName().trim() &&
                    "" != personInfo.getGender().trim() ){
                try{
                    //先向数据库中添加PersonInfo,然后返回id再设置进本地帐户中;
                    //返回受影响的行数,同时由于修改了Mapper文件,会返回在数据库中自增的id,需要在实体类中用get方法取出来;
                    int row=personInfoService.addPersonInfo(personInfo);
                    Integer userId = personInfo.getUserId();
                    localAuth.setUserId(userId);

                    //返回受影响的行数,同时由于修改了Mapper文件,会返回在数据库中自增的id,需要在实体类中用get方法取出来;
                    row = localAuthService.addLocalAuth(localAuth);
                    Integer localAuthId = localAuth.getLocalAuthId();

                    //开始创建用户与角色的关联信息实体类,roleId为2代表普通用户;
                    roleLocalauth.setRoleId(2);
                    //将刚刚返回的帐户在数据库中的Id填入;
                    roleLocalauth.setLocalauthId(localAuthId);
                    //返回值是受影响的行数;
                    roleLocalauthService.addRoleLocalauth(roleLocalauth);

                    return Msg.success().setMsg("注册成功");
                }catch (Exception e){
                    e.printStackTrace();
                    return  Msg.fail().setMsg("保存用户信息或帐户信息失败!");
                }
            }
        }
        return Msg.fail().setMsg("注册失败!");
    }
}
