package com.stephenturley.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.stephenturley"})
public class ExampleConfiguration extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(ExampleConfiguration.class, args);
    }

}

