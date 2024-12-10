package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "homepage";
    }
    @GetMapping("/about")
    @ResponseBody
    public String about(){
        return "무엇에 대하여";
    }
}
