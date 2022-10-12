package com.example.demo;

import com.example.demo.mapper.ScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private ScoreMapper scoreMapper;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
