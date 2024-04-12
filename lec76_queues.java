package shreya.java;

import java.util.*;

public class lec76_queues {
    public static void main(String[] args) {
       Queue<Integer>q = new LinkedList<>();
        System.out.println(q.isEmpty());
       q.add(1);
        System.out.println(q.isEmpty());
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
       q.offer(23);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.element());      //same
        System.out.println(q.peek());
        //same
        PriorityQueue<Integer>pq =new PriorityQueue<>(); //default min pq
        PriorityQueue<Integer>pq2 =new PriorityQueue<>(Comparator.reverseOrder());   //max is given most priority
        pq.add(23);
        pq.add(7);
        pq.add(12);
        System.out.println(pq);



    }
}
