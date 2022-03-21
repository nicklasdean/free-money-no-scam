package com.example.freemoneynoscam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/test")
    public String test(WebRequest dataFromForm){
        System.out.println(dataFromForm.getParameter("email"));
        System.out.println(dataFromForm.getParameter("email"));
        System.out.println(dataFromForm.getParameter("email"));
        System.out.println(dataFromForm.getParameter("email"));
        System.out.println(dataFromForm.getParameter("email"));
        return "redirect:/";
    }
}
