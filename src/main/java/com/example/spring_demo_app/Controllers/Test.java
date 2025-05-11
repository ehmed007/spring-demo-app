package com.example.spring_demo_app.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Test {

    @GetMapping("/")
    public String check() {

        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 5000) {
            Math.sqrt(Math.random());
        }

        return "Spring boot application runnning.";
    }
}
