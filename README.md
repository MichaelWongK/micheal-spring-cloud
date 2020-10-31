# **Spring Cloud Netflix**

Spring Cloud 为开发者提供了在分布式系统（配置管理，服务发现，熔断，路由，微代理，控制总线，一次性 Token，全居琐，Leader 选举，分布式 Session，集群状态）中快速构建的工具，使用 Spring Cloud 的开发者可以快速的启动服务或构建应用、同时能够快速和云平台资源进行对接。

## 概述

Spring Cloud 是一个相对比较新的微服务框架，2016 才推出 1.0 的 Release 版本. 但是其更新特别快，几乎每 1-2 个月就有一次更新，虽然 Spring Cloud 时间最短, 但是相比 Dubbo 等 RPC 框架, Spring Cloud 提供的全套的分布式系统解决方案。

Spring Cloud 为开发者提供了在分布式系统（配置管理，服务发现，熔断，路由，微代理，控制总线，一次性 Token，全居琐，Leader 选举，分布式 Session，集群状态）中快速构建的工具，使用 Spring Cloud 的开发者可以快速的启动服务或构建应用、同时能够快速和云平台资源进行对接。

## 项目结构

**micheal-spring-cloud**

├── [micheal-spring-cloud-admin](https://github.com/MichaelWongK/micheal-spring-cloud/tree/main/micheal-spring-cloud-admin)       				   —— 监控管理系统(server 服务端监控中心)

├── [micheal-spring-cloud-zipkin](https://github.com/MichaelWongK/micheal-spring-cloud/tree/main/micheal-spring-cloud-zipkin)       				    —— 服务链路追踪

├── [micheal-spring-cloud-dependencies](https://github.com/MichaelWongK/micheal-spring-cloud/tree/main/micheal-spring-cloud-dependencies)   		 —— 依赖管理项目

├── [micheal-spring-cloud-eureka](https://github.com/MichaelWongK/micheal-spring-cloud/tree/main/micheal-spring-cloud-eureka)    					 —— 服务注册中心

├── [micheal-spring-cloud-service-admin](https://github.com/MichaelWongK/micheal-spring-cloud/tree/main/micheal-spring-cloud-service-admin)            —— 服务提供者（eureka客户端）

├── [micheal-spring-cloud-web-admin-ribbon](https://github.com/MichaelWongK/micheal-spring-cloud/tree/main/micheal-spring-cloud-web-admin-ribbon)    —— 服务消费者（ribbon + restTemplate 服务调用）

├── [micheal-spring-cloud-web-admin-feign](https://github.com/MichaelWongK/micheal-spring-cloud/tree/main/micheal-spring-cloud-web-admin-feign)       —— 服务消费者（Feign集成了 Ribbon，结合 Eureka ，默认负载均衡 + hystrix）

├── [micheal-spring-cloud-zuul](https://github.com/MichaelWongK/micheal-spring-cloud/tree/main/micheal-spring-cloud-zuul)       					   —— 路由网关统一访问接口 && 路由网关服务过滤功能

├── [micheal-spring-cloud-config](https://github.com/MichaelWongK/micheal-spring-cloud/tree/main/micheal-spring-cloud-config)       				    —— 分布式配置中心(feign服务改造成配置中心客户端)

├── [micheal-spring-cloud-zipkin](https://github.com/MichaelWongK/micheal-spring-cloud/tree/main/micheal-spring-cloud-zipkin)       				    —— 服务链路追踪(收集服务的定时数据，解决微服务架构延迟问题，包括数据的收集、存储、查找和展现)

## 补充配置中心

[micheal-spring-cloud-config](https://github.com/MichaelWongK/micheal-spring-cloud/tree/main/micheal-spring-cloud-config) 默认使用 [配置中心-github](https://github.com/MichaelWongK/spring-cloud-config.git) (因网络问题，可切换为gitee分支管理配置 [配置中心-gitee](https://gitee.com/michealwong/spring-cloud-config.git))

spring-cloud-admin-client 及 spring-cloud-zipkin 已集成至各个微服务中

## 启动顺序

- 注册与发现
- 分布式配置中心
- 服务提供者
- 服务消费者
- API 网关