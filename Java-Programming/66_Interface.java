//Interface is not a class. Every method in interface is public abstract

interface A{
    int age = 44;;   //variables are by default: final and static
    String area = "mumbai";
    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println(x:"in show");
    }
    public void config(){
        System.out.println(x:"in config")
    }
}

public class 66_Interface{
    public static void main(String a[]){
        //A obj;
        //there will be no problem in creating reference of A(means we are creating a type)
        A obj = new B();
        obj.show();
        obj.config();

        //we can directly use variables of a interface without objects
        System.out.println(A.area);

    }
}


/* 1) we create interface so that we can design something
 * 2) Interface will tell you what are the methods you need but it will not implement them
 *    it is the job of class to implement them
*/

/* 3) If you failed to define all the methods in interface then the implementing class will also becomes abstract */

/* why variables of interface are static and final?
 * --> Interface doesnot have separate heap memory and hence it can't have non-final variable.
 * --> Interface variables are static because we don't instantiate the interface because class will instantiate the interface and
 *     in implements we only get methods (not variables) that is why variables of interface are static and final.
 */