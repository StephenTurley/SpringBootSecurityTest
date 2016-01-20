package com.stephenturley.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@Slf4j
public class SomeController {

    @RequestMapping(value = "/derp", method = GET)
    public String foo(){
        return "bar";
    }
}
