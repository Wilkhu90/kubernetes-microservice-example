package org.sumeet.micro1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @RequestMapping(path = "/")
    public String getMainRequest() {
        return "Hello World";
    }

}
