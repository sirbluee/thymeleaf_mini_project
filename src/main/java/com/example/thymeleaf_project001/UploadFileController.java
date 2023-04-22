package com.example.thymeleaf_project001;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UploadFileController {
    @GetMapping("/upload")
    public String upload (){
        return "upload_file";
    }
}
