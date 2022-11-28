package com.lqz.model.factory.simplefactory.pizzastore.order;

import com.lqz.model.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.lqz.model.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.lqz.model.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.lqz.model.factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {

    //返回对应的一个pizza对象
    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("起司披萨");
        } else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒pizza");
        }
        return pizza;
    }
}
