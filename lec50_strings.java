package shreya.java;

public class lec50_strings {
    public static void main(String[] args) {
        String str ="Shreya";
        String s1 ="abc";
        String s2 ="def";
       String s3 = s1.concat(s2);
        System.out.println(s3);
        //interning and new
        String strs ="hello";
        String gtrs ="hello"; //both points to the same address inside the heap to save space
        String x =new String("Hello");//makes a new string hence allocates new adress in the stack
        System.out.println(s1.equals(s2));
    }
}
