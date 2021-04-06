package com.ck.service.impl;

import com.ck.dao.IProvinceDao;
import com.ck.entity.Province;
import com.ck.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProvinceServiceImpl implements IProvinceService {

    @Autowired
    private com.ck.dao.IProvinceDao provinceDao;

    @Override
    public List<Province> queryAll() {
        return provinceDao.queryAll();
    }
}
