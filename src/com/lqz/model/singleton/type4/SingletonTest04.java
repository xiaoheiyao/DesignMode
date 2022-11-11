package com.lqz.model.singleton.type4;

public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); //表示两个对象一致
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

/**
 * 懒汉式（线程安全,同步方法）
 */
class Singleton {
    //1、构造器私有化
    private Singleton() {
    }

    //2、本类内部创建对象实例
    private static Singleton instance;

    //3、提供一个公有的静态方法，返回实例对象,加入同步代码，解决线程不安全问题
    public static synchronized Singleton getInstance() {
        if (instance == null) { //当使用到instance时才去创建
            instance = new Singleton();
        }
        return instance;
    }
}
