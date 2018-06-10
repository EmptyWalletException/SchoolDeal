package com.kingguanzhang.dao;

import com.kingguanzhang.pojo.ProductImg;
import com.kingguanzhang.pojo.ProductImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductImgMapper {
    long countByExample(ProductImgExample example);

    int deleteByExample(ProductImgExample example);

    int deleteByPrimaryKey(Integer productImgId);

    int insert(ProductImg record);

    int insertSelective(ProductImg record);

    List<ProductImg> selectByExample(ProductImgExample example);

    ProductImg selectByPrimaryKey(Integer productImgId);

    int updateByExampleSelective(@Param("record") ProductImg record, @Param("example") ProductImgExample example);

    int updateByExample(@Param("record") ProductImg record, @Param("example") ProductImgExample example);

    int updateByPrimaryKeySelective(ProductImg record);

    int updateByPrimaryKey(ProductImg record);
}