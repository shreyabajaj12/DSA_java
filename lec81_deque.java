package shreya.java;

import java.util.Deque;
import java.util.LinkedList;

public class lec81_deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);
        dq.addFirst(8);
        System.out.println(dq);
        System.out.println(dq.getFirst());


    }
}
