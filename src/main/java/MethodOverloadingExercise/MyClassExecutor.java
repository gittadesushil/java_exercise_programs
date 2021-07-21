package MethodOverloadingExercise;

public class MyClassExecutor {
    public static void main(String[] args) {
        MyClass mc = new MyClass();

        mc.MethodOne();
        mc.MethodOne("pram1","parm2");
        mc.MethodOne("parm");

    }
}
