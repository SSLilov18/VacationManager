package com.example.vacationmanager.model;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}