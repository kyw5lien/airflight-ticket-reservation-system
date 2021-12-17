package tester_classes;

import models.Account;

public class CustomerTester {
    public static void main(String[] args) {
        Account account = new Account("john", "manick", "john32","john32@gmail.com", "password1");
        Account anotherAccount = new Account("daniela", "hantuchova", "danih","danih@gmail.com", "password2");

        System.out.println(account.compareTo(anotherAccount));
    }
}
