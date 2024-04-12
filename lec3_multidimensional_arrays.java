package shreya.java;

import java.util.Scanner;

public class lec3_multidimensional_arrays {
    static void printArray(int[][]arr){
        for(int i =0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){           //same in the case of matrix
                System.out.print(arr[i][j]+" ");
            }
            System.out.println( );

        }
    }
    static void add (int [][]a,int r1,int c1,int [][]b,int r2,int c2){
        if(r1!=r2||c1!=c2){
            System.out.println("wrong input addition not possible");
            return;
        }
        int[][] sum =new int[r1][c2];
        for (int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j] =a[i][j] +b[i][j];
            }
        }
        System.out.println("sum of matrix 1 and 2");
        printArray(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows and columns of matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][]a = new int[r1][c1];
        System.out.println("enter the values ");
        for (int i =0;i<r1;i++){
            for(int j =0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the no. of rows and columns of matrix 1");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][]b = new int[r2][c2];
        System.out.println("enter the values ");
        for (int i =0;i<r2;i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 1");
        printArray(a);
        System.out.println("matrix 2");
        printArray(b);

//        System.out.println("enter no. of rows");
//                int r = sc.nextInt();
//        System.out.println("enter no. of columns");
//                int c = sc.nextInt();
//    int [][]arr = new int[r][c];
//        int[][] arr2 ={{1,5,6},
//                       {7,9,11},
//                       {8,1,1}};
//        System.out.println("enter ");
//        for (int i =0;i<r;i++){
//            for(int j =0;j<c;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }


add(a,r1,c1,b,r2,c2);
        }
    }

