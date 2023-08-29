//A contrete class can implement multiple interfaces but with abstract class we can extend only one class
interface A{
    int age = 44;
    String area = "Mumbai";

    void show();
    void config();
}
interface X{
    void run();
}

//a interface can extend another interface
interface Y extends X{

}

class B implements A,Y{
    public void show(){
        System.out.println(x:"in show");
    }
    public void config(){
        System.out.println(x:"in config");
    }
    public void run(){
        System.out.println(x:"running..");
    }
}


//class - class -> extends
//class - interface -> implements
//interface - interface -> extends

public class 67_MultipleInterfaces{
    public static void main(String[] args){
        A.obj;
        obj = new B();
        obj.show();
        obj.config();

        //A class doesn't have idea about run method
        X obj1 = new B();
        obj1.run();

        //with obj1 we can call run but not other 2 methods
    }
    
}