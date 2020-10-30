package com.micheal.spring.cloud.web.admin.ribbon.controller;

import com.micheal.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:wangmk13@163.com">micheal.wang</a>
 * @date 2020/10/30 16:00
 * @Description
 */
@RestController
public class AdminRibbonController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/getIp", method = RequestMethod.GET)
    public String getIp(String message) {
        return adminService.getIp(message);
    }
}
