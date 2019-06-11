package com.model;

public class Hero {
    private String name;
    private Enemy enemy;

    Hero(Enemy enemy,String name) {
        this.enemy = enemy;
        this.name=name;
    }

    public String getName() {
        return name;
    }
    Hero(){

    }
    public void setName(String name) {
        this.name = name;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public void attack() {
        enemy.attack();
    }
}
