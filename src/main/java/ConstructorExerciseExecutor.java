class Something{
    //constructor
    public Something(){
        System.out.println("Initialization from constructor");
    }

    //method
    public void Something(){
        System.out.println("I am from method");
    }
}

public class ConstructorExerciseExecutor {
    public static void main(String[] args) {
        Something s = new Something();
        s.Something();
    }
}
