package com.oreilly.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    // Entire Controller:
    @GetMapping("/rest")
    public Greeting greet(@RequestParam(defaultValue = "World") String name){
        return new Greeting("Hello, "+ name + "!");
    }

}

// Immutable
// Auto generates toString, Equals, Hashcode  methods
// Getters are not called getMessage they are just called message
record Greeting(String message){}
