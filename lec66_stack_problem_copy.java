package shreya.java;

import java.util.Scanner;
import java.util.Stack;

public class lec66_stack_problem_copy {
    public static void displayrec(Stack<Integer>st){
        if(st.size()==0)return;
        int top = st.pop();
        System.out.print(top+" ");
        displayrec(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer>st = new Stack<>();
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(5);
      st.push(8);
//        System.out.println(st);
//        displayrec(st);
        // System.out.println(st);
        //------------------------------------------------


//        Stack<Integer>rt = new Stack<>();
//        while (st.size()>0){
//            int x =st.pop();
//            rt.push(x);
//        }
//        while (rt.size() > 0) {
//
//            int x =rt.pop();
//            System.out.println(x);
//        }
        //----------------------------------------------------------------------------------------------
        //using array
//        int n = st.size();
//        int [] arr = new int[n];
//        for(int i =n-1;i>=0;i--){
//            int x = st.pop();
//            arr[i]=x;
//        }
//        for(int i=0;i<n;i++){
//            int x = arr[i];
//            System.out.println(x);
//
//            st.push(x);
//        }
        //reverse order
        Stack<Integer>gt =new Stack<>();
        while ((st.size()>0)){
           gt.push(st.pop());
        }
        System.out.println(gt);
        Stack<Integer> rt =new Stack<>();
        while (gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
        //--------------------------------------------------------------
//        int idx =2;
//        int x =7;
//        Stack<Integer>temp = new Stack<>();
//        while (st.size()>idx){
//            temp.push(st.pop());
//        }
//        st.push(x);
//        while (temp.size()>0){
//            st.push(temp.pop());
//        }
//        System.out.println(st);
    }
}
