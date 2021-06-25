import java.util.Scanner;

public class PrameterExercise {

    public void one(String p1, String p2,  String p3, String p4){

    }

    public void two(int a, float b){
        System.out.println("I am method two : "+a + " "+b);
    }

    public void person(String name, int age, double mobile, String address, String fullName){

    }

    public static void main(String[] args) {
        //object
        //object.one
        System.out.println("Welcome to java programming");
        PrameterExercise pe = new PrameterExercise();
        pe.two(5,1);

        pe.person("sushil", 10,0.0,"address","fullname");
    }
}
