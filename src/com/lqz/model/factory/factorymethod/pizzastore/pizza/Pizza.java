package com.lqz.model.factory.factorymethod.pizzastore.pizza;

/**
 * 将pizza 做成抽象类
 */
public abstract class Pizza {

    protected String name;

    /**
     * 准备pizza，每个pizza都不一样，所以做成抽象方法
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name+"back pizza");
    }

    public void cut(){
        System.out.println(name+"cut pizza");
    }

    public void box(){
        System.out.println(name+"box pizza");
    }

    public void setName(String name) {
        this.name = name;
    }
}
