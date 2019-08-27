package com.cd.delicate.web.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author cold
 * @Date 2019/8/27 14:18
 **/
@FeignClient(value = "delicate-core")
public interface ApiTest {

    @RequestMapping("/mytest")
    String test();
}
