package cz.dev.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SavingsAccount implements BankAccount {

    @Override
    public void register() {
        log.info("Create Savings Account");
    }

}
