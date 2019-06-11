package com.model;

public class Animal implements Enemy {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Animal(){

    }

    Animal(String name,String name2){
        this.name=name;
    }
    public void attack() {

        System.out.println(name + "Animal attack");
    }
}
