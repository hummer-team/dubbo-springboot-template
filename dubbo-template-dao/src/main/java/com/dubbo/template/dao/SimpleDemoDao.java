package com.dubbo.template.dao;

import com.hummer.dao.annotation.DaoAnnotation;
import com.dubbo.template.support.model.po.SimpleDemoPo;
import org.apache.ibatis.annotations.Param;

@DaoAnnotation
public interface SimpleDemoDao {
    int insert(@Param("po") SimpleDemoPo po);
    SimpleDemoPo querySingleById(@Param("id")String id);
}