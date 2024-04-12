package shreya.java;

import java.util.Scanner;

public class lec5_transpose_of_matrix {
    static void printmatrix(int[][]matrix){
        for(int i =0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println( );

        }}
    static void reverseArray(int []arr){
        int i =0, j= arr.length-1;
        while (i<j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
    }
//    static  int[][] findtranspose(int[][]matrix,int r ,int c){
//     int [][] ans = new int[c][r];
//
//     for(int i =0;i<c;i++){
//         for(int j =0;j<r;j++){
//             ans[i][j] =matrix[j][i];
//         }
//     }
//     return ans;
//-----------------------------------------------transpose in place
     static void transposeinplace(int[][]matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
           int temp =matrix[i][j];           // ONLY FOR SQUARE MATRIX
           matrix[i][j]=matrix[j][i];
           matrix[j][i] =temp;
        }}}
    static  void rotate (int[][]matrix,int n){
        //transpose
        transposeinplace(matrix,n,n);
        //reverse each row of transposed matrix
        for(int i=0;i<n;i++){
reverseArray(matrix[i]);
        }


    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows and columns of matrix ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalelement = r * c;
        System.out.println("enter" + totalelement + "values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printmatrix(matrix);
//        System.out.println("transpose of a matrix");
//        int [][] ans =findtranspose(matrix,r,c);
//                printmatrix(ans);
        System.out.println("transpose of matrix");
        transposeinplace(matrix,r,c);
        printmatrix(matrix);
        rotate(matrix,r);
        System.out.println("rotation of the matrix");
        printmatrix(matrix);

    }}