package com.beloushkin.learn.soapdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.beloushkin.learn.soapdemo")
public class SoapdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapdemoApplication.class, args);
    }

}
