package StaticKeywordExercise.staticCalssesExample;

public class A {
    int counter = 0;

    static{
        System.out.println("A class Block");
    }

    public void display(){
        System.out.println("Display from class A");
    }
}
