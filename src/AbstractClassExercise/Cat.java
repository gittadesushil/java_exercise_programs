package AbstractClassExercise;

public class Cat extends Animal{
    @Override
    void Sound() {
        System.out.println("not loud");
    }

    @Override
    void talk() {
        System.out.println("meow");
    }

    @Override
    public void Message(){
        System.out.println("I am from cat class");
    }

    public void Message(String a){
        System.out.println("I am from cat class");
    }
}
