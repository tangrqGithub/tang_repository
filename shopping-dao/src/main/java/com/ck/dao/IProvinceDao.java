package com.ck.dao;

import com.ck.entity.Province;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProvinceDao {

    @Select("select * from t_province")
    @ResultMap("provinceMapper")
    public List<Province>queryAll();
}
