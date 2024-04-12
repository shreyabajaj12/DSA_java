package shreya.java;

import java.util.Stack;

public class lec67_reverse_same_stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        st.push(8);
        Stack<Integer>rt = new Stack<>();
        while (st.size()>0){
            rt.push(st.pop());
        }
        Stack<Integer>qt = new Stack<>();
        while(rt.size()>0){
            qt.push(rt.pop());
        }
        while (qt.size()>0){
            st.push(qt.pop());
        }
        System.out.println(st);
    }
}
