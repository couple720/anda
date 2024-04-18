package com.anda.controller;

import com.anda.common.constants.AdminConst;
import com.anda.common.util.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(AdminConst.basePath + "/test")
public class IndexController {
    @GetMapping(value = {"", "/", "/index"})
    @ResponseBody
    public AjaxResult<String> index() {
        return new AjaxResult<String>().setData("Hello World");
    }
}
