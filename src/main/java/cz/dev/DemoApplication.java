package cz.dev;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import cz.dev.model.BankAccount;
import cz.dev.model.BankAccountFactory;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@Slf4j
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public DemoApplication() {

        Scanner scanner = new Scanner(System.in);
        log.info("Please enter\n" +
                " P for Personal account\n" +
                " B for Business account\n" +
                " C for Checking account\n" +
                "----------------------------");
        BankAccount account = BankAccountFactory.createAccount(scanner.nextLine());
        account.register();

    }

}
