package com.qf.springcloud_consumer_ribbon_9090.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author ken
 * @Date 2019/2/12
 * @Version 1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello(){
        //调用服务的提供者
        String result = restTemplate.getForObject("http://provider/test", String.class);
        return "消费者被调用！返回值：" + result;
    }
}
