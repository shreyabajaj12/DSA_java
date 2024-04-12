package shreya.java;

import java.util.Scanner;

public class lec8_generate_spiral {
    static void printmatrix(int [][]matrix) {
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" " );
            }
            System.out.println();
        }}

    static int[][] generateSpiralOrder(int n) {

        int [][]matrix =new int[n][n];
        int toprow =0,bottemrow=n-1 , leftcol =0,rightcol =n-1;
        int current =1;
        while (current<=n*n){
            //top  row = left col to right col
            for(int j = leftcol;j<=rightcol &&current<=n*n;j++){
              matrix[toprow][j] =current;
              current++;
            }
            toprow++;
            //right col = top row to bottom row
            for(int i=toprow;i<=bottemrow &&current <=n*n ;i++){

                matrix[i][rightcol] =current;
                current++;
            }
            rightcol--;
            //bottom row = right col to left col
            for (int j=rightcol;j<=leftcol &&current<=n*n ;j--){
                matrix[bottemrow][j] =current;
                current++;
            }
            bottemrow--;
            //left col = bottom row to top row
            for(int i =bottemrow;i<=toprow &&current<=n*n ;i--){
                matrix[i][leftcol] =current;
                current++;
            }
            leftcol++;

        }
        return matrix;

    }
    public static void main(String[] args) {
        System.out.println("enter the value of n");
     Scanner sc =new Scanner(System.in);
      int[][]matrix =generateSpiralOrder(sc.nextInt());
      printmatrix(matrix);
    }
}
