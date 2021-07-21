package ArrayExercise;

import java.util.Arrays;

public class ArrayFun {
    public static void main(String[] args) {
        String[] a = {"bizz","ziss","check","own"};
        String[] b = {};
        b = a.clone();
        Arrays.sort(a);

        for(String x:a){
            System.out.println(x);
        }
    }
}
