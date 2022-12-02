package com.lqz.model.factory.absfactory.pizzastore.pizza;


public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦起司pizza");
        System.out.println("给伦敦起司pizza准备材料");
    }
}
