package model.user_model;

import helperclasses.EmailValidator;

public class Account extends Person {
    // Fields.
    private String login;
    private String email;
    private String password;

    // Constructors.
    public Account(String name, String lastName, String login, String email, String password) {
        super(name, lastName);
        this.login = login;

        if(EmailValidator.isEmailValid(email))
            this.email = email;

        this.password = password;
    }

    // Getters and Setters.
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString method.
    /*
    @Override
    public String toString() {
        return "Account" + "\n" +
                "Login: " + login + "\n" +
                "E-mail: " + email + "\n" +
                "Password: " + password;
    }
    */

    @Override
    public String toString() {
        return "Account{" +
                "login:'" + login + '\'' +
                ", email:'" + email + '\'' +
                ", password:'" + password + '\'' +
                '}';
    }
}