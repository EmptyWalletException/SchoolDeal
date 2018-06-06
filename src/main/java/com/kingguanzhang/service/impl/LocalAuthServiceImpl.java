package com.kingguanzhang.service.impl;

import com.kingguanzhang.dao.LocalAuthMapper;
import com.kingguanzhang.pojo.LocalAuth;
import com.kingguanzhang.pojo.LocalAuthExample;
import com.kingguanzhang.service.LocalAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LocalAuthServiceImpl implements LocalAuthService {

    @Autowired
    private LocalAuthMapper localAuthMapper;
    @Override
    public List<LocalAuth> getLocalAuthByLoginUsername(String username) {
        LocalAuthExample localAuthExample = new LocalAuthExample();
        LocalAuthExample.Criteria criteria = localAuthExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<LocalAuth> localAuths = localAuthMapper.selectByExample(localAuthExample);

        return localAuths;
    }

    @Override
    public int addLocalAuth(LocalAuth localAuth) {
        localAuth.setCreateTime(new Date(System.currentTimeMillis()));
        localAuth.setEditTime(new Date(System.currentTimeMillis()));

        int i = localAuthMapper.insertSelective(localAuth);
        if (0 > i){
            throw new RuntimeException("账户信息保存失败!");
        }
        return i;
    }
}
