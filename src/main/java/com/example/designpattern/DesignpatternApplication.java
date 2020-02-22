package com.example.designpattern;

import com.example.designpattern.creational.CreationalMainClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternApplication {

    public static void main(String[] args) {
        CreationalMainClass creationalMainClass=new CreationalMainClass();
        SpringApplication.run(DesignpatternApplication.class, args);
    }

}
