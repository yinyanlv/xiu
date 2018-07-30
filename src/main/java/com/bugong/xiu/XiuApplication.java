package com.bugong.xiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class XiuApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiuApplication.class, args);
    }
}
