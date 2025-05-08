package com.learningspring.springboot.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("/api/v1/greet")
public class GreetingController {

    @GetMapping("/{name}") // TODO: use ResponseEntity<> instead of String type.
    public String greetingUser(@PathVariable String name){

        if (name == null || name.trim().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return "Hello " + name + " Welcome to Spring course.";
    }


}
