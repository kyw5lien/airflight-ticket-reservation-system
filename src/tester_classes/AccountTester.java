package tester_classes;

import model.Account;

public class AccountTester {
    public static void main(String[] args) {
        Account account = new Account("D", "Ganne", "dganne", "d@ganne.com", "password0");
        System.out.println(account.toString());
    }
}