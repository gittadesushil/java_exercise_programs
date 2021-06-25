//access_modifier class_keyword name_of_the_class_in_capital_letter
class Person {
    //variables
    //data_type name_of_variable = value_of_the_variable
    String name = "Angel";
    int age = 55;
    int weight = 67;
    double mobileNumber = 9158556548d;

    //method
    //access_modifier return_type name_of_method
    //void meaning is Method should not return anything
    //zero parameter method as this is not accepting any parameter
    public void Walk(){
        System.out.println("Person is walking");
    }

    public void talk(){
        System.out.println("Person is talking");
    }

    public void jump(){
        System.out.println("Person is jumping");
    }
}

public class Executor{
    //method
    //parameters one - string array
    public static void main(String[] args){
        //object,new Person()= object
        //class_name reference = new class_name()
        Person p = new Person();

        //calling the method of class
        //ctrl+space
        p.jump();
        p.Walk();
        p.talk();

        //calling variables of class
        int a = p.age;
        System.out.println("Person age = "+ a);

        System.out.println("Name of the person="+ p.name);

        System.out.println("Person Name="+p.name+" "+"Age="+p.age+" "+"Weight="+p.weight+" "+"Mobile number="+p.mobileNumber);
    }
}
