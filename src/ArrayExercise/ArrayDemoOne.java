package ArrayExercise;

public class ArrayDemoOne {
    public static void main(String[] args) {
        int[] a = new int[5];   //declaration and instantiation

        a[0] = 1;
        a[1] = 11;
        a[2] = 123;

        //print size of array
        System.out.println("The size of array= "+ a.length);

        //print all the element from array
        for(int i=0;i<=5;i++){
            System.out.println("Index="+i+" element value from index="+a[i]);
        }

        //print all the element from array using advanced for loop
        for (int x:a) {
            System.out.println(x);
        }

        //System.out.println(a[6]);
    }
}
