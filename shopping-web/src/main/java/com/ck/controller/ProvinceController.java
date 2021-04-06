package com.ck.controller;

import com.ck.entity.Province;
import com.ck.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProvinceController {

    @Autowired
    private IProvinceService provinceService;

    @GetMapping("queryAll")
    public String queryAll(ModelMap map){
        List<Province> list = provinceService.queryAll();
        map.put("list", list);
        return "index";
    }
}
