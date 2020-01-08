package com.zhdjj.demo.controller;

import com.zhdjj.demo.service.PhoneService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("phoneController")
@Api("PhoneController")
public class PhoneController {
    @Autowired
    PhoneService phoneService;

    @ApiOperation(value = "插入一条",notes = "新增信息")
    @GetMapping("/InsertInfo")
    @CrossOrigin
    public String Insert() throws IOException {
        phoneService.InsertInfo();
        return "success";
    }
}
