package com.example.livewell;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

   
    @GetMapping("/get")
    public String home() {
        return "Hello, World!";
    }

    @PostMapping("/post")
    public String dopost() {
        return  "Kavita is vedi";
    }
}
