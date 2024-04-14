package com.example.demo1.mapper;

import com.example.demo1.entity.AdminMenuEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMenuMapper {
    AdminMenuEntity selectById(int id);
}
