package AbstractClassExercise;

public class ClassUser extends Animal{
    @Override
    void Sound() {
        System.out.println("Sound from class user");
    }

    @Override
    void talk() {
        System.out.println("Talk from class user");
    }
}
