package com.example.thymeleaf_project001;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
    @GetMapping("/view_profile")
    public String profiles(){
        return "profile";
    }
}
