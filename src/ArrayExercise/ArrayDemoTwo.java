package ArrayExercise;

public class ArrayDemoTwo {
    public static void main(String[] args) {
        int[] a = {1,11,123}; //declare, instate, initialization
        String[] names = {"alpha","beta","gamma","something else"};
        float[] values = {1,2,3,4,5,6,7,8};
        char[] char_values = {'a','b','c','d'};

        for (int single_element:a) {
            System.out.println(single_element);
        }
    }
}
