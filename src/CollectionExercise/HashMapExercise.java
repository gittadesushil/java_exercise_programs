package CollectionExercise;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {
    public static void main(String[] args) {
        HashMap<String,String> myMap = new HashMap<String, String>();
        myMap.put("a","alpha");
        myMap.put("b","beta");
        myMap.put("b","duplicate beta");
        myMap.put("g","gamma");




        for (Map.Entry mm: myMap.entrySet()){
            System.out.println(mm.getKey() + "=" + mm.getValue());
        }


        HashMap<Integer,String> studentMap = new HashMap<Integer, String>();
        studentMap.put(11,"alpha");
        studentMap.put(12,"beta");

        System.out.println("Roll No : "+ studentMap.get(12));
        

        for (Map.Entry mm: studentMap.entrySet()){
            System.out.println("Roll No. : " + mm.getKey() +  " Student Name: " + mm.getValue());
        }
    }
}
