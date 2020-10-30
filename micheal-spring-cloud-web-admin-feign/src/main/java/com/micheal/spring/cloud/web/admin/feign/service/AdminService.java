package com.micheal.spring.cloud.web.admin.feign.service;

import com.micheal.spring.cloud.web.admin.feign.service.hystrix.AdminHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @author <a href="mailto:wangmk13@163.com">micheal.wang</a>
 * @date 2020/10/30 15:51
 * @Description feign中集成了ribbon
 * 通过 @FeignClient("服务名") 注解来指定调用哪个服务
 */
@FeignClient(value = "service-admin", fallback = AdminHystrixService.class)
public interface AdminService {


    @RequestMapping(value = "getIp", method = RequestMethod.GET)
    public String getIp(@RequestParam(value = "message") String message);
}
