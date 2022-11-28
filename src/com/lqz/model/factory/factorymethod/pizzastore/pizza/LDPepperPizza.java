package com.lqz.model.factory.factorymethod.pizzastore.pizza;


public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println("给伦敦胡椒pizza准备材料");
    }
}
