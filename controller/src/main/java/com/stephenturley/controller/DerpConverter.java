package com.stephenturley.controller;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DerpConverter implements Converter<String, String> {

    @Resource
    private PasswordEncoder passwordEncoder;

    @Override
    public String convert(String source) {
        return passwordEncoder.encode(source);
    }
}
