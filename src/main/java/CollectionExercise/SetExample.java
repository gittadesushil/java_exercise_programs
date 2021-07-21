package CollectionExercise;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExample {
    public static void main(String[] args) {
        //maintain insertion order
        LinkedHashSet<String> lset = new LinkedHashSet<>();

        lset.add("apple");
        lset.add("kiwi");
        lset.add("apple");
        lset.add("Apple");
        lset.add("orange");

        LinkedHashSet<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(1);
        integerSet.add(11111);

        System.out.println(lset);


        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("kiwi");
        set.add("apple");
        set.add("Apple");
        set.add("orange");

        System.out.println(set);

//        HashSet<String> set1 =  (HashSet<String>) set.clone();
//        System.out.println(set1);

        //set.clear();
        //boolean isEmpty = set.isEmpty();
        //System.out.println(isEmpty);

        //System.out.println(set.size());

        boolean isAvailable = set.contains("Apdddfdfple");
        System.out.println(isAvailable);

        for (String s:set) {
            System.out.println(s);
        }









    }
}
