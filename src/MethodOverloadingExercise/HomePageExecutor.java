package MethodOverloadingExercise;

public class HomePageExecutor {
    public static void main(String[] args) {
        HomePage hp = new HomePage();
        hp.Search("Mumbai");

        hp.Search("Delhi",true);

    }
}
