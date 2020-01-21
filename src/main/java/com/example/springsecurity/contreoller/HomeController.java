package com.example.springsecurity.contreoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/")
    public String controller(){
        return "Hi";
    }

    @GetMapping("/user")
    public String controller1()
    {
        return ("<h1> Hi user</h1>");
    }

    @GetMapping("/admin")
    public String controller2()
    {
        return ("<h1> Hi Admin </h1>");
    }

}
