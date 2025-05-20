import java.util.*;
class shape{
    
    void calculateArea(){
        System.out.println("the area of this shape ");
    }
}

class Circle extends shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    void calculateArea(){
        System.out.println("the area of circle shape is  "+3.14*radius*radius);
    }
}
class Rectangle extends shape{
    double length,breadth;
    Rectangle(double length,double breadth){
        this.breadth=breadth;
        this.length=length;
    }
    void calculateArea(){
        System.out.println("the area of rectangle shape is  "+length*breadth);
    }
}
class Triangle extends shape{
    double height,width;
    Triangle(double height,double width){
        this.height=height;
        this.width=width;
    }
    void calculateArea(){
        System.out.println("the area of circle shape is  "+0.5*height*width);
    }
}
public class Shape {
    public static void main(String[] args) {
        shape s;
    s=new Circle(4);
    s.calculateArea();
    s=new Triangle(4,8);
    s.calculateArea();
    }
    
}
