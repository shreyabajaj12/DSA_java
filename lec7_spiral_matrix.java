package shreya.java;

import java.util.Scanner;

public class lec7_spiral_matrix {
    static void printmatrix(int [][]matrix) {
    for(int i=0;i< matrix.length;i++){
    for(int j=0;j<matrix[i].length;j++){
        System.out.print(matrix[i][j]+" " );
    }
    System.out.println();
    }}

    static void printSpiralOrder(int[][]matrix ,int r,int c) {
       int toprow =0,bottomrow = r-1 , leftcol =0,rightcol =c-1;
       int totalelements =0;
       while (totalelements<r*c){
           //top  row = left col to right col
           for(int j = leftcol;j<=rightcol && totalelements<r*c;j++){
               System.out.print(matrix[toprow][j]+" ");

               totalelements++;
           }
           toprow++;
           //right col = top row to bottom row
           for(int i=toprow;i<=bottomrow &&totalelements<r*c;i++){
               System.out.print(matrix[i][rightcol]+" ");

               totalelements++;
           }
           rightcol--;
           //bottom row = right col to left col
           for (int j=rightcol;j>=leftcol && totalelements<r*c;j--){
               System.out.print(matrix[bottomrow][j]+" ");

               totalelements++;
           }
           bottomrow--;
           //left col = bottom row to top row
           for(int i =bottomrow;i>=toprow &&totalelements<r*c;i--){
               System.out.print(matrix[i][leftcol]+" ");

               totalelements++;


           }
           leftcol++;

       }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no.of rows and cols");
        int r =sc.nextInt();
        int c =sc.nextInt();
        int [][] matrix =new int[r][c];
        int total =r*c;
        System.out.println("enter"+total+"numbers");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
            System.out.println("input matrix");
            printmatrix(matrix);
            System.out.println("spiral order");
            printSpiralOrder(matrix,r,c);

        }

    }
}
