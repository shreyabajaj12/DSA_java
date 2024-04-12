package shreya.java;

import java.util.Stack;

public class lec72_prefix_expression {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println(infix);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            //'0' ->48 and '9' ->57
            if (ascii >= 48 && ascii <= 57) {
                String s = ""+ch;
                val.push(s);
            } else if (op.size() == 0 ||ch =='('||op.peek()=='(')
                op.push(ch);

                //agar ) aa jaiye to jab tk  ( na aaye tb tk solve kro
            else if(ch==')') {
                while (op.peek() != '(') {
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop();
            }
                else{
                if (ch == '+' || ch == '-') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                    //push
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        //work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                        //push
                        op.push(ch);
                    }
                    else op.push(ch);

                }
            }
        }

        //val stack size -> 1             //this is for the end case when string length =0
        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);

    }
        String prefix = val.pop();
        System.out.println(prefix);
    }}



