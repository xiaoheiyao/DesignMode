package com.lqz.model.factory.absfactory.pizzastore.order;

import com.lqz.model.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.lqz.model.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.lqz.model.factory.absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
