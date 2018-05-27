package com.kingguanzhang.dao;


import com.kingguanzhang.pojo.WechatAuth;
import com.kingguanzhang.pojo.WechatAuthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WechatAuthMapper {
    long countByExample(WechatAuthExample example);

    int deleteByExample(WechatAuthExample example);

    int deleteByPrimaryKey(Integer wechatAuthId);

    int insert(WechatAuth record);

    int insertSelective(WechatAuth record);

    List<WechatAuth> selectByExample(WechatAuthExample example);

    WechatAuth selectByPrimaryKey(Integer wechatAuthId);

    int updateByExampleSelective(@Param("record") WechatAuth record, @Param("example") WechatAuthExample example);

    int updateByExample(@Param("record") WechatAuth record, @Param("example") WechatAuthExample example);

    int updateByPrimaryKeySelective(WechatAuth record);

    int updateByPrimaryKey(WechatAuth record);
}