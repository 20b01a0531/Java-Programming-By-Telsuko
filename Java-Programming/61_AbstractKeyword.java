abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println(x:"play music");
    }
}

abstract class WagonR extends Car{
    
    public void drive(){
        System.out.println(x:"Driving..");
    }
    
}
class UpdatedWagonR extends WagonR{  //concrete class
    public void fly(){
        System.out.println(x:"flying")
    }
}

public class 61_AbstractKeyword{
    public static void main(String a[]){
        Car obj = new UpdatedWagonR();
        obj.drive();
        //according to dynamic dispatch it will call the drive method in wagonR class
        obj.playMusic();
        obj.fly();
    }
}


/* 1)->use of abstrac method<-: if you don't know what to do with the method in the class and it is an important method we use abstract method. 
 *    So instead of defining we can declare the method
 *    ->defining: public void drive() { };
 *    ->declaring: public void drive();
 * 2)Later someone can defining that method using a class and implement the (drive) method
 * 3)If you want to just declare a method then we use abstract. In the above example the class car is just giving an idea that you need drive feature.
 * 4)-->Abstract method can only belong to Abstract class.<--
 * 5)-->If your extending abstract class then you definitely need to define all abstract methods.<--
 * 6)-->You cannot create object of abstract class but you can create refrence of abstract class.<--
 * 7)-->It not compulsory for a abstract class to have abstract method(it can have normal methods).<--
 * 8)-->In case if the extending class cannot able to implement all the abstract methods then we have to make the extending class(WagonR) as an abstract class.<--
 * 9)In that case we cannot create objects for WagonR. so we need to create another class(UpdateWagonR).
 */

 //Abstract keyword can be used with methods if you want to declare them
