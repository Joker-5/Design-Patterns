package com.joker.factorymethod;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        return pizza;
    }

    // 具体创建交给子类实现
    abstract Pizza createPizza(String type);
}
