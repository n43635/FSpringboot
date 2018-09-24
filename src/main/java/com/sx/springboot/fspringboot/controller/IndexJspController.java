package com.sx.springboot.fspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Conreoller跳转到index.jsp
 */

@Controller
public class IndexJspController {
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }
}
