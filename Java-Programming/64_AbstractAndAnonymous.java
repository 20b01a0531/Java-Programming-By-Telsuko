//abstract and anonymous
abstract class A{
    public abstract void show();
}

public class 64_AbstractAndAnonymous{
    public static void main(String a[]){
        A obj = new A()  //this is the object of anonymous inner class
        {
            public void show(){
                System.out.println(x:"in new show");
            }
        }
        //providing implementation of abstract class here itself
    }
}

//if we want to implement the abstract class only once we use this inner class