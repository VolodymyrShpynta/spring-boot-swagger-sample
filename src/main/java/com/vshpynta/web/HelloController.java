package com.vshpynta.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloController {

    @RequestMapping(value = "/", method = GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
