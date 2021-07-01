package StringExercise;

import java.util.Locale;

public class StringPractise {
    public static void main(String[] args) {
        String name1 = "automation";
        String name2 = "automation";
        String address = new String("street xyz, place, country");

        System.out.println(name1.equals(name2));
        System.out.println(name1.toUpperCase(Locale.ROOT));
        System.out.println(name1.replace('a','b'));
        System.out.println(address.charAt(5));
        System.out.println(name1.isEmpty());
        System.out.println(name1.concat(name2));

        String village1 = "alpha";
        String village2 = "Alpha";
        System.out.println(village1.equalsIgnoreCase(village2));

        char[] pp = name1.toCharArray();
        String[] newString = name1.split("m");


    }
}
