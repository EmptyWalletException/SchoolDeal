package com.kingguanzhang.dao;

import com.kingguanzhang.pojo.RoleLocalauth;
import com.kingguanzhang.pojo.RoleLocalauthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface RoleLocalauthMapper {
    long countByExample(RoleLocalauthExample example);

    int deleteByExample(RoleLocalauthExample example);

    int deleteByPrimaryKey(Integer roleLocalauthId);

    int insert(RoleLocalauth record);

    int insertSelective(RoleLocalauth record);

    List<RoleLocalauth> selectByExample(RoleLocalauthExample example);

    RoleLocalauth selectByPrimaryKey(Integer roleLocalauthId);

    int updateByExampleSelective(@Param("record") RoleLocalauth record, @Param("example") RoleLocalauthExample example);

    int updateByExample(@Param("record") RoleLocalauth record, @Param("example") RoleLocalauthExample example);

    int updateByPrimaryKeySelective(RoleLocalauth record);

    int updateByPrimaryKey(RoleLocalauth record);
}