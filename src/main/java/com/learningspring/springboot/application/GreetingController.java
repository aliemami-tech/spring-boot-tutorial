package com.learningspring.springboot.application;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greet")
public class GreetingController {

    @GetMapping("/{name}") // TODO: user ResponseEntity<> instead of String type.
    public String greetingUser(@PathVariable String name){
        return "Hello " + name + " Welcome to Spring course.";
    }


}
