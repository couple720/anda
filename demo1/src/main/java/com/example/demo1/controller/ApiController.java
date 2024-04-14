package com.example.demo1.controller;

import com.example.demo1.entity.AdminMenuEntity;
import com.example.demo1.mapper.AdminMenuMapper;
import com.example.demo1.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private AdminMenuMapper adminMenuMapper;

    @GetMapping(value = {"", "/", "/index"})
    public AjaxResult<String> index() {
        return new AjaxResult<String>().setData("Hello World");
    }

    @GetMapping(value = {"/test"})
    public AjaxResult<AdminMenuEntity> test() {
        AdminMenuEntity adminMenu = this.adminMenuMapper.selectById(27);
        return new AjaxResult<AdminMenuEntity>().setData(adminMenu);
    }
}
