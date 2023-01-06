package cz.dev.model;

import java.security.InvalidParameterException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankAccountFactory {

    public static BankAccount createAccount(String account) {
        BankAccount bankAccount = null;

        if (account.equals("P")) {
            bankAccount = new PersonalAccount();
        } else if (account.equals("S")) {
            bankAccount = new SavingsAccount();
        } else if (account.equals("B")) {
            bankAccount = new BusinessAccount();
        } else {
            log.info("No Account in ban offer");
            throw new InvalidParameterException();
        }

        return bankAccount;
    }
}
