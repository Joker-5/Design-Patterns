package com.joker.simplefactory;

import com.sun.org.apache.xpath.internal.operations.Or;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        return factory.createPizza(type);
    }

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        store.orderPizza("cheese").eat();
        store.orderPizza("pepperoni").eat();
    }
}
