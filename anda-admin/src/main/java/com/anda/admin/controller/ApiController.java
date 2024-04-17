package com.anda.admin.controller;

import com.anda.admin.entity.AdminMenuEntity;
import com.anda.common.util.AjaxResult;
import com.anda.admin.dao.AdminMenuMapper;
import com.github.pagehelper.PageInfo;
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
    public AjaxResult<PageInfo<AdminMenuEntity>> test() {
        return new AjaxResult<PageInfo<AdminMenuEntity>>().setData(this.adminMenuMapper.selectListByPage(1, 20));
    }
}
