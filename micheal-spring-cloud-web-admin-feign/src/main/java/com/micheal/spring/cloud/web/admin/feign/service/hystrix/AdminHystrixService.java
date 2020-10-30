package com.micheal.spring.cloud.web.admin.feign.service.hystrix;

import com.micheal.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:wangmk13@163.com">micheal.wang</a>
 * @date 2020/10/30 17:08
 * @Description
 */
@Component
public class AdminHystrixService implements AdminService {

    @Override
    public String getIp(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
