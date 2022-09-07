package com.example.thymeleafspringbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("a1","Tharindu Madhusankha");
        return "helloworld";
    }

    @GetMapping("/style")
    public String style(Model model){
        model.addAttribute("b1","talented,creative and responsible");
        model.addAttribute("c1","looking for a talented ");
        model.addAttribute("c2"," It's ");
        return "css-js-demo";
    }

    @GetMapping("/bootstrap")
    public String addBootsrap(Model model){
        model.addAttribute("a1","Welcome");
        return "add-bootstrap";
    }

}

