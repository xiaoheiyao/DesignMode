package com.lqz.model.factory.factorymethod.pizzastore.order;

import com.lqz.model.factory.factorymethod.pizzastore.pizza.Pizza;
import com.lqz.utils.StringUtil;

public abstract class OrderPizzaFactory {

    public OrderPizzaFactory(){
        Pizza pizza= null;
        String orderType;
        do {
            System.out.println("input pizza type:");
            orderType = StringUtil.getReader();
            pizza = createPizza(orderType);//由工厂子类完成
            if (pizza == null){
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }
    //抽象出创建工厂的方法
    public abstract Pizza createPizza(String type);

}
