package com.lqz.model.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给起司pizza准备材料");
    }
}
