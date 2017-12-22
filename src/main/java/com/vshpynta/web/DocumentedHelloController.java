package com.vshpynta.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/rest")
public class DocumentedHelloController {

    @RequestMapping(value = "/hello", method = GET)
    public String documentedIndex() {
        return "Hello from documented by Swagger endpoint";
    }
}
