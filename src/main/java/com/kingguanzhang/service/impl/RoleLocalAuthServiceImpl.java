package com.kingguanzhang.service.impl;

import com.kingguanzhang.dao.RoleLocalauthMapper;
import com.kingguanzhang.pojo.RoleLocalauth;
import com.kingguanzhang.service.RoleLocalauthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleLocalAuthServiceImpl implements RoleLocalauthService {

    @Autowired
    private RoleLocalauthMapper roleLocalauthMapper;

    @Override
    public int addRoleLocalauth(RoleLocalauth roleLocalauth) {
        int i = roleLocalauthMapper.insertSelective(roleLocalauth);
        if (0 > i){
            throw new RuntimeException("账号授权失败");
        }
        return i;
    }
}
