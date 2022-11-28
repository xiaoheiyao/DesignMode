package com.lqz.principle.singleresponsibility;

/**
 * 单一职责3
 */
public class SingleResponsiblity3 {

//    Vehicle vehicle = new Vehicle();
public static void main(String[] args) {
    Vehicle3 vehicle = new Vehicle3();
    vehicle.run("摩托车");
    vehicle.runWater("轮船");
    vehicle.runAir("飞机");
}


}

class Vehicle3 {

    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行。。。。");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空上运行。。。。");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水上运行。。。。");
    }
}


