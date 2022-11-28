package com.lqz.model.factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京起司pizza");
        System.out.println("给北京起司pizza准备材料");
    }
}
