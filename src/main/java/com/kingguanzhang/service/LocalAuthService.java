package com.kingguanzhang.service;

import com.kingguanzhang.pojo.LocalAuth;

import java.util.List;

public interface LocalAuthService {
    List<LocalAuth> getLocalAuthByLoginUsername(String username);
}
