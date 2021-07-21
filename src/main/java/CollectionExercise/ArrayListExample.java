package CollectionExercise;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

//        String[] array = new String[5];
//        array[0] = 1;

        ArrayList<String> sl = new ArrayList<String>();
        sl.add("city one");
        sl.add("city two");
        sl.add("city three");
        sl.add("city four");

        ArrayList<Character> cl = new ArrayList<Character>();
        cl.add('c');
        cl.add('a');

        ArrayList<Integer> il = new ArrayList<Integer>();
        il.add(1);
        il.add(12);
        il.add(12);
        il.add(12);

        Person p1 = new Person();
        p1.name = "alpha";

        Person p2 = new Person();
        p2.name = "beta";

        Person p3 = new Person();
        p3.name = "gamma";

        ArrayList<Person> pl = new ArrayList<Person>();
        pl.add(p1);
        pl.add(p2);
        pl.add(p3);


        for(Person x:pl)
        System.out.println(x.name);









        ArrayList arrList = new ArrayList();
        arrList.add("string data");
        arrList.add(1111);
        arrList.add('c');
        arrList.add(23333f);

        arrList.removeAll(arrList);



        Iterator al = arrList.iterator();

        while(al.hasNext()){
            System.out.println(al.next());
        }





//        ArrayList<String> city = new ArrayList<String>(); //create a arraylist
//
//        city.add("mumbai");
//        city.add("pune");
//        city.add("delhi");
//        city.add("amravati");

//        for(String s :city)
//        {
//            System.out.println(s);
//        }

//        Iterator i = city.iterator();
//
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
    }
}

class Person{
    String name = "Automation";

    public void SetName(String name){
        System.out.println(name);
    }
}
