package com.lqz.model.factory.factorymethod.pizzastore.pizza.order;

import com.lqz.model.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.lqz.model.factory.factorymethod.pizzastore.pizza.BJGreekPizza;
import com.lqz.model.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.lqz.model.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizzaFactory extends OrderPizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (type.equals("greek")){
            pizza = new BJGreekPizza();
        }else if (type.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
