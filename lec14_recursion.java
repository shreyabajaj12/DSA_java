package shreya.java;

import java.util.Scanner;

public class lec14_recursion {
//    static void printmultiples (int n,int k){
//        if(k==1){
//        System.out.println(n);
//        if(k==0)
//       return;
//        printmultiples(n,k-1);
//        System.out.println(n*k);

 //}
//    static int seriessum1 (int n ){
//        if(n==0){
//            return 0;
//        }
//      return   seriessum1(n-1)+n;
//    }
    static int seriessum2(int n ){
        if(n==0)return 0;
        if(n%2==0){
            return seriessum2(n-1)-n;
        }
        else return seriessum2(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        int k =sc.nextInt();
//        printmultiples(n,k);
        int n = sc.nextInt();
//        System.out.println(seriessum1(n));
        System.out.println(seriessum2(n));
    }
}
