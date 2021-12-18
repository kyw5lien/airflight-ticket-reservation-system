package models;

/**
 * Class design for Users.
 * Contains a list of Accounts and methods to add and retrieve Accounts from a Users Set.
 * @author D&aacute;rio Neves https://github.com/kyw5lien
 * @version 0.1.0
 */

import java.util.HashSet;
import java.util.Set;

public class Users {
    // Fields.
    private Set<Account> users;

    // Constructors.
    public Users(){
        users = new HashSet<Account>();
    }
    public Users(Set<Account> users) {
        this.users = users;
    }

    // Methods.
    public void addAccount(Account Account) {
        users.add(Account);

    }

    public Account findAccountByLogin(String login) {
        for(Account Account : users){
            if(Account.getLogin() == login){
                return Account;
            }
        }
        return null;
    }

    public Account findAccountByEmail(String email){
        for (Account Account : users) {
            if (Account.getEmail().equals(email)) {
                return Account;
            }
        }
        return null;
    }

    // Getters and Setters.
    public Set<Account> getUsers() {
        return users;
    }

    public void setUsers(Set<Account> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Users{" +
                "users=" + users +
                '}';
    }
}