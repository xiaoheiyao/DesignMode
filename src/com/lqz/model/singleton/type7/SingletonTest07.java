package com.lqz.model.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); //表示两个对象一致
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

/**
 * 静态内部类
 */
class Singleton {
    //1、构造器私有化
    private Singleton() {
    }

    //2、静态内部类，该类中有一个静态属性
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    //3、提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {

        return SingletonInstance.INSTANCE;
    }
}
