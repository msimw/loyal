package com.loyal.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangxiaodong on 16-3-6.
 */
@Controller
public class HomeController {


    @RequestMapping("/")
    public String home(){

        return "/index/index";
    }

}
