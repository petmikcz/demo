package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.example.demo.model.Message;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@Slf4j
public class DemoApplication {

    // private static final Logger log =
    // LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

    }

    public DemoApplication() {
        logInfo();
    }

    public void logInfo() {
        Message msg1 = new Message("aaaa");
        Message msg2 = new Message("aaaa");

        boolean equals1 = msg1.equals(msg2);
        log.info(String.valueOf(equals1));
        boolean bool = msg1.hashCode() == msg2.hashCode();
        log.info(String.valueOf(bool));

    }

    static {
        log.info(" <<< init static content >>>");
    }

}
