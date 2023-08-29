//--anonymous-- means something which doesnot have a name
class A{
    public void show(){
        System.out.println(x:" in A Show");
    }
}

public class Anonynous{
    public static void main(String a[]){
        A obj = new A()
        {
            public void show(){
                System.out.println(x:"in new show");
            }
        }
        //this is anonymous inner class (since it doesnot have a name and it is inner class)
        obj.show();
    }
}

//output: in new show