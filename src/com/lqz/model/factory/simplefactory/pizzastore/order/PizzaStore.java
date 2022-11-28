package com.lqz.model.factory.simplefactory.pizzastore.order;

import com.lqz.model.factory.simplefactory.pizzastore.order.OrderPizza;

/**
 * 相当于一个客户端，发起pizza订购
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza();
        System.out.println("~退出程序~");
    }
}
