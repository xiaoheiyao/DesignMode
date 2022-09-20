package com.lqz.principle.ocp;
//开闭原则

/**
 * 方式二
 *
 */
public class Ocp2 {
    public static void main(String[] args) {
        //这是使用看看存在的问题
        GraphicEditor2 graphicEditor = new GraphicEditor2();
        graphicEditor.drawShape(new Rectangle2());
        graphicEditor.drawShape(new Circle2());
        graphicEditor.drawShape(new Triangle2());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

class GraphicEditor2 {
    public void drawShape(Shape2 s){
        s.draw();
    }
}

abstract class Shape2{
    int m_type;
    public abstract void draw();
}

class Rectangle2 extends Shape2 {
    Rectangle2(){
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class Circle2 extends Shape2 {
    Circle2(){
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Triangle2 extends Shape2{
    Triangle2(){
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
class OtherGraphic extends Shape2{

    OtherGraphic(){
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("其他图形");
    }
}