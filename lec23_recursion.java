package shreya.java;

public class lec23_recursion {
    static void printSSQ (String s ,String currans){
        if (s.length() ==0){
            System.out.println(currans);
            return;
        }
        char curr =s.charAt(0);
        String remString =s.substring(1);
        //curr char choose to be a currans;
        printSSQ(remString , currans+curr);
        //curr char choose not to be a currans;
        printSSQ(remString , currans);
    }
    public static void main(String[] args) {
        printSSQ("abc","");



    }
}
