package com.anda.controller;

import com.anda.common.util.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping(value = {"", "/", "/index"})
    public AjaxResult<String> index() {
        return new AjaxResult<String>().setData("Hello World");
    }
}
