package com.goodnews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GoodNewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodNewsApplication.class, args);
    }
}
