package com.lqz.model.factory.absfactory.pizzastore.order;

import com.lqz.model.factory.absfactory.pizzastore.pizza.Pizza;
import com.lqz.utils.StringUtil;

public class OrderPizza {

    AbsFactory absFactory;

    //构造方法传值
    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = ""; //用户输入
        absFactory = factory;

        do {
            System.out.println("使用抽象工厂模式订购：");
            orderType = StringUtil.getReader();
            //Factory可能是北京的工厂子类，也可能是北京的工厂子类
            pizza = absFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }
}
