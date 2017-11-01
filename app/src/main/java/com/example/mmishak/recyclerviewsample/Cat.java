package com.example.mmishak.recyclerviewsample;

public class Cat {

    private String name;
    private String descriptiion;

    public Cat(String name, String descriptiion) {
        this.name = name;
        this.descriptiion = descriptiion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptiion() {
        return descriptiion;
    }

    public void setDescriptiion(String descriptiion) {
        this.descriptiion = descriptiion;
    }
}
