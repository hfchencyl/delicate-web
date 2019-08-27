package com.cd.delicate.web.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author cold
 * @Date 2019/8/27 10:34
 **/
@RestController
public class TestController {

    @Resource
    private ApiTest apiTest;

    @RequestMapping(value = "/test")
    public String test() {
        String result = apiTest.test();
        return result;
    }

}
