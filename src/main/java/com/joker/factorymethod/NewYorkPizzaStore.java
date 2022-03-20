package com.joker.factorymethod;

public class NewYorkPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            return new NewYorkCheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new NewYorkPepperoniPizza();
        }
        return pizza;
    }
}
