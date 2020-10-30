package com.micheal.spring.cloud.web.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author <a href="mailto:wangmk13@163.com">micheal.wang</a>
 * @date 2020/10/30 15:35
 * @Description
 */
@Configuration
public class RestTemplateConfiguration {

    /**
     * @description: Ribbon的负载均衡：RestTemplate添加 @LoadBalanced 轮询访问
     * @author micheal.wang <a href="michael.won007@gmail.com"/>
     * @create 2020/10/30
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
