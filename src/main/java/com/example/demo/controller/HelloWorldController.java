package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private final HelloService helloService;

    public HelloWorldController(HelloService helloService){
        this.helloService=helloService;
    }
    @GetMapping("/")
    public String saludar() {
        return helloService.recibirMensaje();
    }
}