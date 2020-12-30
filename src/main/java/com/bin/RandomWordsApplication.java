package com.bin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.bin.dao")
public class RandomWordsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomWordsApplication.class, args);
    }

}
