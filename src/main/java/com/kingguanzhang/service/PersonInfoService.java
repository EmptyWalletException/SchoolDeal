package com.kingguanzhang.service;

import com.kingguanzhang.pojo.PersonInfo;

import java.util.List;

public interface PersonInfoService {
    int addPersonInfo(PersonInfo personInfo);

    List<PersonInfo> getByName(String inputValue);
}
