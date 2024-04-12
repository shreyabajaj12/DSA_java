package shreya.java;

import java.util.Scanner;

public class lec15_recursion {
//    public static void hcf(int a , int b){
//     int hcf =1;
//     for(int i=1;i<=a&&i<=b;i++){
//         if(a%i==0 &&b%i==0){
//             hcf =i;
//         }
//     }
//        System.out.println(hcf);
//    }
//    static int igcd (int x ,int y){
//        while (x%y!=0){
//            int rem =x%y;
//            x=y;
//            y=rem;
//
//        }return y;
//
//    }

    //EUCLID'S ALGORITHM
    static int gcd (int x ,int y){
        if(y==0)return x;
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        hcf(a,b);
        int x =sc.nextInt();
        int y =sc.nextInt();
//        System.out.println(igcd(x,y));
        System.out.println(gcd(x,y));
        
    }
}