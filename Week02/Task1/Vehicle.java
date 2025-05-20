import java.util.*;
class Vehicleproperty{
    void speed(){
        System.out.println("this is speed of vehicle");
    }
    void fuel(){
        System.out.println("capacity of fuel container");
    }
}
class car extends Vehicleproperty{

 void speed(){
        System.out.println("this is speed of car");
    }
    void fuel(){
        System.out.println("capacity of car fuel container");
    }
}
class bike extends Vehicleproperty{
     void speed(){
        System.out.println("this is speed of bike");
    }
    void fuel(){
        System.out.println("capacity of bike fuel container");
    }
}
public class Vehicle {
    public static void main(String[] args) {
       Vehicleproperty v;
       v=new car();
       v.speed();
       v=new bike();
       v.fuel();
        
    }
}
