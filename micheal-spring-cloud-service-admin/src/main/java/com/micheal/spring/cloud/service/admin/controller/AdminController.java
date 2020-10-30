package com.micheal.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:wangmk13@163.com">micheal.wang</a>
 * @date 2020/10/30 15:11
 * @Description
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/getIp", method = RequestMethod.GET)
    public String getIp(String message) {
        return String.format("Hi, your message is : %s port : %s", message, port);
    }
}
