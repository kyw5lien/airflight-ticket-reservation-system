package tester_classes;

import models.Account;

public class AccountTester {
    public static void main(String[] args) {
        Account account = new Account("Donna", "Gayle", "dgayle", "d@gayle.com", "password0");
        System.out.println(account.toString());
    }
}