package CollectionExercise;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueExercise {
    public static void main(String[] args) {
       // Queue<String> q = new LinkedBlockingQueue<>();//Maintain insertion order

        Queue<String> q = new PriorityQueue();//does not maintain insertion order

        q.add("apple");
        q.add("organe");
        q.add("kiwi");
        q.add("banana");

        for (String x:q) {
            System.out.println(x);
        }

        System.out.println(q);//head

        //System.out.println(q.element());
        System.out.println(q.peek());//head

        q.remove();
        System.out.println(q.peek());//head

    }
}
