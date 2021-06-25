package StaticKeywordExercise;

public class BlockExercise {

    //datatype name = value;
    static int counter = 0;

    //block
    static{
        System.out.println("I am from static block");
        counter++;
    }

    public static void main(String[] args){
        System.out.println("I am from main method");
        counter++;
        System.out.println(counter);
    }
}
