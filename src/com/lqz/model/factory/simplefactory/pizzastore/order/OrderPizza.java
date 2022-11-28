package com.lqz.model.factory.simplefactory.pizzastore.order;

import com.lqz.model.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.lqz.model.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.lqz.model.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 购买pizza
 */
public class OrderPizza {


    Pizza pizza = null;
    String orderType = ""; //用户输入
    public OrderPizza(){
        do {
            orderType = getType();
            this.pizza = SimpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购pizza失败");
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
