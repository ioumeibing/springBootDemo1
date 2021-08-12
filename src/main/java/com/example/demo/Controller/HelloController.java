package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
    @RequestMapping("/testPage")
    public ModelAndView testPage(){
        ModelAndView m= new ModelAndView("testPage");
        return m;
    }
}


