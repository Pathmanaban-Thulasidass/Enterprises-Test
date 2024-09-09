package com.example.SimpleWebProj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/greet")
//    @ResponseBody // It say it does not return layout it returns String (value)
    public String greet(){
        return "Muruga!!.. you did";
    }



}
