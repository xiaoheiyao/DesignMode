package com.lqz.principle.singleresponsibility;

public class SingleResponsiblity1 {

//    Vehicle vehicle = new Vehicle();
public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    vehicle.run("摩托车");
    vehicle.run("汽车");
    vehicle.run("飞机");
}


}

class Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行。。。。");
    }
}


