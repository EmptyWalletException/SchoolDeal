package com.kingguanzhang.dao;

import com.kingguanzhang.pojo.LocalAuth;
import com.kingguanzhang.pojo.LocalAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocalAuthMapper {
    long countByExample(LocalAuthExample example);

    int deleteByExample(LocalAuthExample example);

    int deleteByPrimaryKey(Integer localAuthId);

    int insert(LocalAuth record);

    int insertSelective(LocalAuth record);

    List<LocalAuth> selectByExample(LocalAuthExample example);

    LocalAuth selectByPrimaryKey(Integer localAuthId);

    int updateByExampleSelective(@Param("record") LocalAuth record, @Param("example") LocalAuthExample example);

    int updateByExample(@Param("record") LocalAuth record, @Param("example") LocalAuthExample example);

    int updateByPrimaryKeySelective(LocalAuth record);

    int updateByPrimaryKey(LocalAuth record);
}