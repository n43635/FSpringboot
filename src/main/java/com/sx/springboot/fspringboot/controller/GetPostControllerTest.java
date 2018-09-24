package com.sx.springboot.fspringboot.controller;

import com.sx.springboot.fspringboot.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @GetMapping = @RequestMapping(value = "",method = RequestMethod.GET)
 * @PostMapping = @RequestMapping(value = "",method = RequestMethod.POST)
 */

@RestController
public class GetPostControllerTest {

    //使用传统设置GET请求方式
    //@RequestMapping(value = "/boot/getTest",method = RequestMethod.GET)

    //直接使用@GetMapping进行GET请求
    @GetMapping("/boot/getTest")
    public Object getUser(){
        User user = new User();
        user.setId(111);
        user.setName("张三丰");
        return user;
    }

    //post与get使用方法一样,浏览器使用的是get,打开会保存不支持
    //@PostMapping("/boot/postTest")

    @RequestMapping(value = "/boot/postTest",method = RequestMethod.POST)
    public Object getUser2(){
        User user = new User();
        user.setId(112);
        user.setName("张无忌");
        return user;
    }
}
