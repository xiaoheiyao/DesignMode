package com.lqz.model.factory.absfactory.pizzastore.order;

import com.lqz.model.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.lqz.model.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.lqz.model.factory.absfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
