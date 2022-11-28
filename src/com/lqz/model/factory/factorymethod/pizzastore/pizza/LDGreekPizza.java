package com.lqz.model.factory.factorymethod.pizzastore.pizza;


public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦希腊pizza");
        System.out.println("给伦敦希腊pizza准备材料");
    }
}
