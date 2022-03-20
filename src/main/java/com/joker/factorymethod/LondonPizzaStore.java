package com.joker.factorymethod;

public class LondonPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            return new LondonCheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new LondonPepperoniPizza();
        }
        return pizza;
    }
}
