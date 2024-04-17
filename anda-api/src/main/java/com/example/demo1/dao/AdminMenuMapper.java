package com.example.demo1.dao;

import com.example.demo1.entity.AdminMenuEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMenuMapper {
    AdminMenuEntity selectById(int id);

    List<AdminMenuEntity> selectList();

    default PageInfo<AdminMenuEntity> selectListByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<AdminMenuEntity> list = selectList();
        return new PageInfo<>(list);
    }
}
