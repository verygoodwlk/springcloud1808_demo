package com.qf.springcloud_consumer_feign_9091.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ken
 * @Time 2019/2/12 15:10
 * @Version 1.0
 */
@FeignClient("provider")
public interface MyFegin {

    @RequestMapping("/test")
    String test();
}
