package com.news.entities;

import java.util.Objects;

public class User extends Entity{
    private String name;
    private String lastName;
    private String login;
    private String password;
    private String email;
    private Role role = new Role("user");


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    @Override
    public int hashCode(){
        return Objects.hash(name,lastName,login,password,email,role);
    }

    @Override
    public boolean equals(Object o ){
        if (this == o ) return true;
        if ( o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(this.name,user.name) &&
                Objects.equals(this.email, user.email) &&
                Objects.equals(this.lastName, user.lastName) &&
                Objects.equals(this.login, user.login) &&
                Objects.equals(this.password,user.password) &&
                Objects.equals(this.role, user.role);

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
