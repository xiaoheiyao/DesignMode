package com.lqz.model.singleton.type1;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); //表示两个对象一致
        System.out.println("instance1.hashCode = "+instance1.hashCode());
        System.out.println("instance2.hashCode = "+instance2.hashCode());
    }
}

/**
 * 饿汉式（静态变量）
 */
class Singleton {
    //1、构造器私有化
    private Singleton(){

    }
    //2、本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3、提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
