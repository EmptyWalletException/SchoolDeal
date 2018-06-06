package com.kingguanzhang.service.impl;

import com.kingguanzhang.dao.PersonInfoMapper;
import com.kingguanzhang.pojo.PersonInfo;
import com.kingguanzhang.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonInfoServiceImpl implements PersonInfoService {

    @Autowired
    private PersonInfoMapper personInfoMapper;

    @Override
    public int addPersonInfo(PersonInfo personInfo) {
        personInfo.setCreateTime(new Date(System.currentTimeMillis()));
        personInfo.setEditTime(new Date(System.currentTimeMillis()));
        personInfo.setUserType(2);//userType是预留字段,具体意义留着以后再定义
        personInfo.setEnableStatus(1);//用户状态,预留给以后记录用户是否封禁等;
        int personInfoId = personInfoMapper.insertSelective(personInfo);
        if (0 > personInfoId){
            throw new RuntimeException("用户信息保存失败!");
        }
        return personInfoId;
    }
}
