package AbstractClassExercise;

public class ClassUserExecutor {
    public static void main(String[] args) {
        ClassUser cc = new ClassUser();

        Animal a  = new ClassUser();
        Animal b = new Cat();
        Cat bb = new Cat();
        Animal c = new Dog();

        a.talk();
        b.talk();
        c.talk();

        a.Message();
        b.Message();
        bb.Message("aa");
        c.Message();



    }
}
