package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DemoApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

    }

    public DemoApplication() {
        // logClassLoares();
    }

    static {
        log.info("init static content".toUpperCase());
    }

    public void logClassLoares() {
        log.info("ClassLoader Application --- " + DemoApplication.class.getClassLoader());
        log.info("ClassLoader Logger --- " + Logger.class.getClassLoader());
        log.info("ClassLoader String --- " + String.class.getClassLoader());

    }

}
