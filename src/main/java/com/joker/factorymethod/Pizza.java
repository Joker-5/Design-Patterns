package com.joker.factorymethod;

public abstract class Pizza {
    protected String name;

    public void eat(String name) {
        System.out.println("eat " + name);
    }

    public String getName() {
        return name;
    }
}
