package com.sx.springboot.fspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试application.properties中的自定义配置参数的Controller
 * 使用ConfigurationProperties注解方式
 */
@Controller
@Component

//prefix的值是自定义配置参数的前缀('.'前面的),'.'后面的作为成员变量
@ConfigurationProperties(prefix = "boot")
public class ConfigInfoControllerV2 {
    private String name;
    private String location;

    @Autowired
    private ConfigInfoControllerV1 config1;

    //通过set方法传入值
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //如有需要创建对象调用则需要创建get方法
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @RequestMapping("/boot/config2")
    public @ResponseBody String config2(){
        return "使用ConfigurationProperties注解方式:" + name + "  " + location+
                "\n使用@Value注解方式:" + config1.getName() + "  " + config1.getLocation();
    }
}
