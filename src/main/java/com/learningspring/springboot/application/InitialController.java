package com.learningspring.springboot.application;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class InitialController {

    @GetMapping("/{name}")
    public String HelloWorld(@PathVariable String name){
        return "Hello " + name;
    }


}
