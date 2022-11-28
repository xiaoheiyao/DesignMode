package com.lqz.model.factory.factorymethod.pizzastore.pizza;

public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京希腊pizza");
        System.out.println("给北京希腊pizza准备材料");
    }
}
