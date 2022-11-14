package com.example.vacationmanager;
public class User {

    private String username;
    private String name;
    private String password;
    private String lastName;
    private String role;
    private String team;
    public User () {

    }

    public User(String username, String name, String password, String lastName, String role, String team) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.lastName = lastName;
        this.role = role;
        this.team = team;
    }
}