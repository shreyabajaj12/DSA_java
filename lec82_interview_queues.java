package shreya.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class lec82_interview_queues {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<q.size()-3;i++) {
            st.push(q.remove());
        }

        while(st.size()>0){
            q.add(st.pop());
            System.out.println(q);
            q.add(q.remove());
            q.add(q.remove());
            System.out.println(q);





        }
    }
}
