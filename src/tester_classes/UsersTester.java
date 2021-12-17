package tester_classes;

import models.Account;
import models.Users;

public class UsersTester {
    public static void main(String[] args) {
        // Declaring some airplane vars for populating the Airplanes List.
        Account acc1 = new Account("kevin", "mitnick", "mitnick", "k@mitnick.com", "password1");
        Account acc2 = new Account("daniela", "hantuchova", "hantuchova", "d@hantuchova.com", "password2");
        Account acc3 = new Account("anna", "kournikova", "kournikova", "a@kournikova.com", "password3");
        Account acc4 = new Account("nina", "hartley", "hartley", "nina@hartley.com", "password4");

        // Populating the Users List.
        Users users = new Users();
        users.addAccount(acc1);
        users.addAccount(acc2);
        users.addAccount(acc3);
        users.addAccount(acc4);

        // Testing the Users class ...
        // Test 1: List Users
        System.out.println("---- Listing Users ----");
        users.listUsers();

        // Test 2: Find user by login
        String login = "hartley";
        System.out.println("---- Retrieving user with login " +login +" ----");
        System.out.println(users.findAccountByLogin(login));

        // Test 3: Find user by email
        String email = "d@hantuchova.com";
        System.out.println("---- Searching user's email " +email +" ----");
        if(users.findAccountByEmail(email) == null) {
            System.out.println("No account with email " +email +" found.");
        } else{
            System.out.println(users.findAccountByEmail(email));
        }
    }
}