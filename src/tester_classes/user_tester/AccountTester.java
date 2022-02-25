package tester_classes.user_tester;

import model.user_model.Account;

public class AccountTester {
    public static void main(String[] args) {
        Account account = new Account("Dimitry", "Blastov", "dblastov", "d@blastov.org", "password0");
        Account anAccount = new Account("Svetlana", "Watroff", "swatroff", "s@watroff.com", "password1" );

        System.out.println(account.toString());
        System.out.println(anAccount.toString());
    }
}