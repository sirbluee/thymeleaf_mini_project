package com.example.thymeleaf_project001;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {
    @GetMapping("/article")
    public String article(){
         return "article";
    }
}
