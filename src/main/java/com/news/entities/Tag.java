package com.news.entities;

import java.util.Objects;

public class Tag extends Entity{

    public Tag(String name,int id) {
        this.name = name;
        setId(id);
    }

    public Tag() {
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);

    }

    @Override
    public boolean equals(Object o){
        if (this == o ) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(this.name,tag.name);
    }

    @Override
    public String toString() {
        return "Tag{" +
                "name='" + name + '\'' +
                '}';
    }
}
