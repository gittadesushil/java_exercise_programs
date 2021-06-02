class Methods {

    //zero parameter
    public void m1(){
        System.out.println("Zero parameter method");
    }

    //one parameter
    public void m2(String p){
        System.out.println("One parameter method");
        System.out.println(p);
    }

    //two parameter
    public void m3(int a, char b, float c){
        System.out.println("Tree parameter method: "+a+" "+b+" "+c);
    }

    //four parameter
    public void m4(int p, String q, double s, boolean y){
        System.out.println("Four parameter method: "+p+" "+q+" "+s+" "+y);
    }

    public void fullName(String firstName, String lastName){
        System.out.println("Full Name = "+firstName+" "+lastName);
    }
}

public class MethodExecutor{
    public static void main(String[] args){
        //User defined data type is Methods
        Methods m = new Methods();

        //calling the methods
        //m.m1();

        //m.m2("hello, this is the value for you");

        //m.m3(12,'a',1.2f);

        //m.m4(4, "vaishnavi", 564854555875d, false);

        m.fullName("peter", "alexander");
        m.fullName("sushil", "tade");
        m.fullName("hello", "java");
    }
}
