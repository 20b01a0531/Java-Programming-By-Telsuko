//Need of interface
class Laptop{
    public void code(){
        System.out.println(x:"code, compile, run");
    }
}

//to work with application we need a laptop
class Devloper{
    public void devApp(Laptop lap){
        //writing a laptop here a issue because class developer cannot write code with desktop
        lap.code();
    }
}

public class 65_NeedOfInterface{
    public static void main(String a[]){
        Laptop lap = new Laptop();
        Devloper gayathri = new Devloper();
        gayathri.devApp(lap);
    }
}

//output--->code, compile, run


//the above example is not flexible(tight coupling) because developer is depended on laptop


//Improving the example

abstract class Computer{
    public abstract void code();
}

class Laptop extends Computer{
    public void code(){
        System.out.println(x:"code, compile, run");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println(x:"code, compile, run : faster")
    }
}

class Devloper{
    public void devApp(Computer lap){
        lap.code();
    }
}

class 65_NeedOfInterface{
    public static void main(String a[]){
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer gayathri = new Developer();
        gayathri.devApp(lap);
        gayathri.devApp(desk);
    }
}

/*output-->code, compile, run
 *         code, compile, run: faster */


 //the example is loosely coupled


 //so instead of using abstract class of computer we can interface-->

interface Computer{
   void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println(x:"code, compile, run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println(x:"code, compile, run : faster")
    }
}

class Devloper{
    public void devApp(Computer lap){
        lap.code();
    }
}

class 65_NeedOfInterface{
    public static void main(String a[]){
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer gayathri = new Developer();
        gayathri.devApp(lap);
        gayathri.devApp(desk);
    }
}

/*There are mainly three reasons to use interface.
   1)It is used to achieve abstraction.
   2)By interface, we can support the functionality of multiple inheritance.
   3)It can be used to achieve loose coupling. 
*/