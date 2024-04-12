package shreya.java;

public class lec52_stringbuilder2 {
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder("world");
        System.out.println(str);
        str.append(7);   //to add anything at end
        str.setCharAt(0,'m');
        System.out.println(str);
        str.insert(2,'y');
        System.out.println(str);
        str.deleteCharAt(0);
        System.out.println(str);
        str.reverse();

        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(2,4);
        System.out.println(str);
        str.substring(1 ,2);
        System.out.println(str);


    }
}
