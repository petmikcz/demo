package com.example.demo;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@Slf4j
public class DemoApplication {

    Logger logger = Logger.getLogger(DemoApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    public DemoApplication() {
        showClassLoaders();
    }

    public void showClassLoaders() {
        log.info("Class CL >>> " + DemoApplication.class.getClassLoader());
        log.info("Logging CL >>> " + Logger.class.getClassLoader());
        log.info("ArrayList CL >>> " + ArrayList.class.getClassLoader());

    }

}
