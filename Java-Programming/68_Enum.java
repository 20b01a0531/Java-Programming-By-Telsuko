//enums are named constanst which we create

enum Status{
    Running, Failed, Pending, Success; //all these are objects //named constants(instead of using numbers or string we use named constants)

}

public class Enum{
    public static void main(String[] a){
        int i = 5;
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        //to get all values
        Status[] ss = Status.values();
        for(Status s1 : ss){
            System.out.println(s1+" : "+s1.ordinal());
        } 
        //status has index to access
    }
}

/*output -> Running
 *          0
 *          Running : 0
 *          Failed : 1
 *          Pending : 2
 *          Success : 3
*/

/* ->Example is when you are working with networking and say you send a request to the server and
 *   server will give you some status like if it accepted the request or rejected or resource not
 *   found error. So there are error numbers for every type of data we get from the server and also 
 *   we can have name for it.
 * ->When we know that there are specific error codes or specific constants instead of creating different
 *   objects you can a create enum.
*/

/* -->Advantage of enum is if you want to use an application where you want return status to the client
 *    whether it is failed or success or pending instead of returning a string format or specific object
 *    you can simply return one of the status.(it will make your work easy).
 */