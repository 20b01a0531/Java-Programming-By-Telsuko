class A{
    int age;
    public void show(){
        System.out.println("in show");
    }
    class B{
        public void config(){
            System.out.println(x:"in config");
        }
    }
}

public class 62_InnerClass{
    public static void main(String a[]){
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B(); 
        //In order to access properties of A class we need obj, similarly we need obj to create object of B as B is a inner class of A
        obj1.config();
    }
}



/* 1)Inner class : A class inside class
 * 2)If there is a class that is completely depended on another class than we use class inside a class
 * 3)The inner class will not be openly available(so we call it A.B)
 * 4)In order to create obj of inner class we need object of outer class
*/

/* We can also make the inner class a static class. so that we don't require any object to call the properties of inner class
 * We cannot make outer class a static class
 * why we cannot make the outer class static?
 * -->1)Whenever we run a class JVM will create a object. All static objects are created in static memory and not in heap memory. 
 *      Meaning, we have same set of copy to all objects. So if the top class is static and u run the program, it creates a static object 
 *      and keep over riding on to the same static memory. which is wrong.
 * -->2)We should define members as static which Should be common to all objects of the class. Since, Every class is already common 
 *      to all of its objects and there is no need to make it static to become available to all of its objects.
 */

//<---------------------------------------------------when inner class is static---------------------------------------------->
class A{
    int age;
    public void show(){
        System.out.println("in show");
    }
    static class B{
        public void config(){
            System.out.println(x:"in config");
        }
    }
}

public class innerClass{
    public static void main(String a[]){
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B(); 
        //we don't need an object since it is a static class
        obj1.config();
    }
}

