package com.floristeria.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/home")

public class indexController {
    @GetMapping("/")
    public String index(){
        return "home2";
    }

    @GetMapping("/index")
    public String index2(){
        return "home";
    }

    
}
