package com.example.thymeleaf_project001;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/home")
    public String home(){

        return "index";
    }
}
