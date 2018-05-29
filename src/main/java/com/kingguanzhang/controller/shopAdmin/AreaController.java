package com.kingguanzhang.controller.shopAdmin;

import com.kingguanzhang.dto.Msg;
import com.kingguanzhang.pojo.Area;
import com.kingguanzhang.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AreaController {

    @Autowired
    AreaService areaService;

    @RequestMapping("/ajax/Area")
    @ResponseBody
    public Msg getAreas(){
       List<Area> areaList =  areaService.getAreas();
       return Msg.success().add("areas",areaList);
    }
}
