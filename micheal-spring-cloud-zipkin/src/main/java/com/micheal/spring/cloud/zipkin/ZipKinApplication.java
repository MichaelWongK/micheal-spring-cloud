package com.micheal.spring.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @author <a href="mailto:wangmk13@163.com">micheal.wang</a>
 * @date 2020/10/31 13:48
 * @Description 链路追踪服务
 * 追踪服务
 * 在 所有需要被追踪的项目（除了 dependencies 项目外都需要被追踪，包括 Eureka Server
 * 中增加 spring-cloud-starter-zipkin 依赖
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipKinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class, args);
    }
}
