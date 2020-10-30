package com.micheal.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author <a href="mailto:wangmk13@163.com">micheal.wang</a>
 * @date 2020/10/30 15:51
 * @Description
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${service-url.admin-service}")
    private String adminServiceUrl;

    /**
     * 在 Ribbon 调用方法上增加 @HystrixCommand 注解并指定 fallbackMethod 熔断方法
     * @param message
     * @return
     */
    @HystrixCommand(fallbackMethod = "getIpError")
    public String getIp(String message) {
        return restTemplate.getForObject(adminServiceUrl + "/getIp/?message=" + message, String.class);
    }

    public String getIpError(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
