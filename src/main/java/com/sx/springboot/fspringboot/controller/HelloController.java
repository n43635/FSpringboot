package com.sx.springboot.fspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring的Controller Hello World测试
 * 要注意与main同级目录或者在main的下级,在main上级会找不到
 */

//@Controller与SpringMVC中一样用于处理http请求
@Controller
public class HelloController {

    //与Spring中的一样,相当于访问的子路径
    @RequestMapping("/boot/hello")
    public @ResponseBody String hello(){
        return "Hello Spring Soot.";
    }
}
