package com;

import com.config.DbConfig;
import com.config.DbConfig02;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @EnableEurekaClient
 *
 * 服务注册端  将服务注册在eureka上
 * 提供者项目创建方式与注册中心服务器相同，并且做以下修改：
 *
 * 1. 需要将@EnableEurekaServer改为@EnableEurekaClient。
 *
 * 2. spring-cloud-starter-netflix-eureka-server依赖修改为spring-cloud-starter-netflix-eureka-client。
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableConfigurationProperties({DbConfig.class, DbConfig02.class})
public class SpbBrianQueryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpbBrianQueryServiceApplication.class, args);
    }

}

