package com.abmcursos.abmcursos.models;

public class TUsers {
    private String User;
    private String Password;


    public TUsers(String user, String password) {
        User = user;
        Password = password;
    }


    public String getUser() {
        return User;
    }


    public void setUser(String user) {
        User = user;
    }


    public String getPassword() {
        return Password;
    }


    public void setPassword(String password) {
        Password = password;
    }

}
