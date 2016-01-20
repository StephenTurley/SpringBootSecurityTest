package com.stephenturley.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@Slf4j
public class SomeController {

    @Resource
    private DerpRepository derpRepository;

    @RequestMapping(value = "/derp", method = POST)
    public void foo(String foo){
        derpRepository.save(new Derp(foo));
    }
}
