package com.lqz.model.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2); //表示两个对象一致
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

/**
 * 双重检查
 */
class Singleton {
    //1、构造器私有化
    private Singleton() {
    }

    //2、本类内部创建对象实例
    //todo volatile可以让修改立即更新到主存
    private static volatile Singleton instance;

    //3、提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        if (instance == null) { //当使用到instance时才去创建
            synchronized (Singleton.class) {
                if (instance == null){
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }
}
