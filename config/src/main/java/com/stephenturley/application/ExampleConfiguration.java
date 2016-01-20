package com.stephenturley.application;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_FIELDS;
import static com.fasterxml.jackson.databind.MapperFeature.AUTO_DETECT_GETTERS;

@Slf4j
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.stephenturley"})
public class ExampleConfiguration extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(ExampleConfiguration.class, args);
        log.info("foo");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index.html");
        registry.addViewController("/signup").setViewName("index.html");
        registry.addViewController("/privacy-policy").setViewName("index.html");
    }

    @Bean
    public ObjectMapper objectMapper(){
        ObjectMapper mapper = new ObjectMapper();

        mapper.setSerializationInclusion(NON_NULL)
                .configure(AUTO_DETECT_GETTERS, true)
                .configure(AUTO_DETECT_FIELDS, false);

        return mapper;
    }

}

