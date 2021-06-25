package StaticKeywordExercise.staticCalssesExample;

public class Executor {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.counter);
        a1.display();

        A a2 = new A();
        System.out.println(a2.counter);
        a1.display();

        B b1 = new B();

        b1.counter++;
        B.jump++;
        System.out.println(b1.counter);
        System.out.println("jump value="+ B.jump);

        B b2 = new B();
        System.out.println(b2.counter);
        System.out.println("jump value="+B.jump);

        B b3 = new B();
        System.out.println(b3.counter);
        System.out.println("jump value="+B.jump);

    }
}
