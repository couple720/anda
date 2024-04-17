package com.anda.admin.dao;

import com.anda.admin.entity.AdminMenuEntity;
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
