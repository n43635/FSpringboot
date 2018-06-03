package com.sx.springboot.fspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试application.properties中的自定义配置参数的Controller
 * 使用Value注解方式
 */
@Controller
public class ConfigInfoControllerV1 {

    //将配置文件中自定义的参数值注入到变量里
    @Value("${boot.name}")
    private String name;

    @Value("${boot.location}")
    private String location;

    @Autowired
    private ConfigInfoControllerV2 config2;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @RequestMapping("/boot/config")
    private @ResponseBody String config(){
        return "使用@Value注解方式:" + name + "  " + location +
                "\n使用ConfigurationProperties注解方式:" + config2.getName() + "  " + config2.getLocation();
    }
}
