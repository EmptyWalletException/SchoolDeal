package com.kingguanzhang.service.impl;

import com.kingguanzhang.dao.AreaMapper;
import com.kingguanzhang.pojo.Area;
import com.kingguanzhang.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> getAreas() {
        List<Area> areaList = areaMapper.selectByExample(null);
        return areaList;
    }
}
