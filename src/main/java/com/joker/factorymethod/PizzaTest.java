package com.joker.factorymethod;

public class PizzaTest {
    public static void main(String[] args) {
        LondonPizzaStore londonPizzaStore = new LondonPizzaStore();

        Pizza londonCheese = londonPizzaStore.createPizza("cheese");
        londonCheese.eat(londonCheese.getName());

        Pizza londonPepperoni = londonPizzaStore.createPizza("pepperoni");
        londonPepperoni.eat(londonPepperoni.getName());

        NewYorkPizzaStore newYorkPizzaStore = new NewYorkPizzaStore();

        Pizza newYorkCheese = newYorkPizzaStore.createPizza("cheese");
        newYorkCheese.eat(newYorkCheese.getName());

        Pizza newYorkPepperoni = newYorkPizzaStore.createPizza("pepperoni");
        newYorkPepperoni.eat(newYorkPepperoni.getName());
    }
}
