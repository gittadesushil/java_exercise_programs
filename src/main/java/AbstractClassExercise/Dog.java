package AbstractClassExercise;

public class Dog extends Animal{
    @Override
    void Sound() {
        System.out.println("loud");
    }

    @Override
    void talk() {
        System.out.println("Barking");
    }
}
