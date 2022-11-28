package com.lqz.principle.inversion;

/**
 * 依赖反转原则（依赖倒置）
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new VChat());
    }
}
class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件信息:Hello,world";
    }
}

class VChat implements IReceiver{
    public String getInfo(){
        return "微信信息:Hello,world";
    }
}

interface IReceiver {
    String getInfo();
}

class Person{
    public void receive(IReceiver info){
        System.out.println(info.getInfo());
    }
}