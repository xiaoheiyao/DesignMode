package com.lqz.model.factory.factorymethod.pizzastore.pizza.order;

import com.lqz.utils.StringUtil;

public class PizzaStore {
    public static void main(String[] args) {
        String type = "";
        do {
            System.out.println("选择地址：");
            type = StringUtil.getReader();
            if (type.equals("bj")) {
                new BJOrderPizzaFactory();
            } else if (type.equals("ld")) {
                new LDOrderPizzaFactory();
            } else if (type.equals("exit")) {
                break;
            } else {
                System.out.println("请重新选择地址~");
            }
        } while (true);
    }
}
