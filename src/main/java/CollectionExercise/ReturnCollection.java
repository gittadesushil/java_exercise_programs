package CollectionExercise;

import java.util.ArrayList;
import java.util.HashMap;

public class ReturnCollection {
    //which returns a Hashmap where key = String value = int

    public HashMap<String,Integer> MethodOne(){
        HashMap<String,Integer> x = new HashMap<>();
        return x;
    }

    //return arraylist of type char with 5 chars inside it
    public ArrayList<Character> MethodTwo(){
        ArrayList<Character> x = new ArrayList<>();
        x.add('x');
        x.add('y');
        x.add('z');
        x.add('p');
        x.add('q');

       return x;
    }

    public String MethodReturnString(){
        String x = "udisfsodfsdof0";
        return x;
    }
}
