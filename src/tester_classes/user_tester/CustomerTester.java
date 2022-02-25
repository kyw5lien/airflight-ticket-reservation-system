package tester_classes.user_tester;

import model.user_model.Account;

public class CustomerTester {
    public static void main(String[] args) {
        Account account = new Account("daniela", "h", "danih","danih@gmail.com", "password1");

        System.out.println(account.getFirstName());
        System.out.println(account.getLastName());
        System.out.println(account.getLogin());
        System.out.println(account.getEmail());
        System.out.println(account.getPassword());
    }
}