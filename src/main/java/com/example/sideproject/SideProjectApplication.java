package com.example.sideproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class SideProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SideProjectApplication.class, args);
    }

    @Bean
    public DateTimeFormatter dateTimeFormatter() {
        final String pattern = "yyyy-MM-dd HH:mm:ss";
        return DateTimeFormatter.ofPattern(pattern);
    }

}
