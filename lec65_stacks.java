package shreya.java;

import java.util.Stack;

public class lec65_stacks {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);             //to add
        st.push(2);
        st.push(7);
        st.push(78);
        System.out.println(st.peek());  //to return topmost element
        System.out.println(st);
        st.pop();                            //to delete
        System.out.println(st);
        System.out.println("size is  "+st.size());
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st.isEmpty());

    }
}
