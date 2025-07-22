package com.oreilly.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {

    @GetMapping("/hello") // maps to localhost:8080/hello?name=Dolly
    // The RequestParam is REQUIRED but if user doesn't provide one we fallback to World
    public String sayHello(@RequestParam(defaultValue = "World") String name,
                           Model model){
        model.addAttribute("user", name);
        return "welcome"; // forwards to src/main/resources/templates/welcome.html (we had to create welcome.html)
    }
}
