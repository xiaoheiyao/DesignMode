package com.lqz.model.factory.absfactory.pizzastore.order;

import com.lqz.model.factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {
      public Pizza createPizza(String orderType);
}
