package com.lqz.model.factory.simplefactory.pizzastore.pizza;

public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给胡椒pizza准备材料");
    }
}
