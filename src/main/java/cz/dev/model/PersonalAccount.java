package cz.dev.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonalAccount implements BankAccount {

    @Override
    public void register() {
        log.info("Create Personal Account");
    }
}
