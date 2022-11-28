package com.lqz.model.factory.factorymethod.pizzastore.pizza.order;

import com.lqz.model.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.lqz.model.factory.factorymethod.pizzastore.pizza.LDGreekPizza;
import com.lqz.model.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.lqz.model.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizzaFactory extends OrderPizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (type.equals("greek")){
            pizza = new LDGreekPizza();
        }else if (type.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
