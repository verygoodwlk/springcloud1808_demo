package com.qf.springcloud_consumer_feign_9091;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringcloudConsumerFeign9091Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerFeign9091Application.class, args);
    }

}

