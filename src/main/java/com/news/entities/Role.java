package com.news.entities;

import java.util.Objects;

public class Role extends Entity{
    private String role;

    public Role(String role) {
        this.role = role;
    }

    public Role (){
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode(){
        return Objects.hash(role);
    }
    @Override
    public boolean equals(Object o){
        if (this == o ) return true;
        if ( o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(this.role,role.role);
    }

    @Override
    public String toString() {
        return "Role{" +
                "role='" + role + '\'' +
                '}';
    }
}
