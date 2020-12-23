package com.guodf.owner.generator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName TestController
 * @Description TOOD
 * @Author Administrator
 * @Date 2020/12/17 2:39
 * @Version 1.0
 **/
@RestController
@Slf4j
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String logTest(String name, String age) {
        log.info("logTest,name:{},age:{}", name, age);
        return "success";
    }
}
