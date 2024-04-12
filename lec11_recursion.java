package shreya.java;

import java.util.Scanner;

public class lec11_recursion {
    public static void printdec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printdec(n-1);

    }
    static void printinc(int n) {
        if (n == 1) {
            System.out.println(n);                               //BASE CASE  //halting condition
            return;
        }
        printinc(n-1);                                       //SMALLER PROBLEM
        System.out.println(n);                                   //SELF WORK
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      //  printinc(n);
        printdec(n);
    }
}
