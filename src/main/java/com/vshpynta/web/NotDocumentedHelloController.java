package com.vshpynta.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class NotDocumentedHelloController {

    @RequestMapping(value = "/", method = GET)
    public String notDocumentedIndex() {
        return "This endpoint SHOULD NOT BE available in Swagger docs";
    }
}
