package com.lqz.principle.singleresponsibility;

/**
 * 单一职责2
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        RoadVehicle ariVehicle = new RoadVehicle();
        ariVehicle.run("飞机");
        RoadVehicle waterVehicle = new RoadVehicle();
        waterVehicle.run("轮船");
    }
}

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 公路运行");
    }
}

class AriVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 天空运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 水上运行");
    }
}
