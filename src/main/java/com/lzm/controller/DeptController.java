package com.lzm.controller;


import com.lzm.pojo.Dept;
import com.lzm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 部门表 前端控制器
 * </p>
 *
 * @author lzm
 * @since 2021-07-07
 */
@RestController
@RequestMapping("/dept")
@Validated
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping(value = "/testDept")
    public List<Dept> getDiscoverPageList() {
        List<Dept> list = deptService.lambdaQuery().list();
        return list;
    }


}

