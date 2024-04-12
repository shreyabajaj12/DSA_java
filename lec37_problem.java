package shreya.java;

public class lec37_problem {
    static void display(int []num){
        for (int a:num
             ) {
            System.out.println(a);

        }
    }
    static void partition (int[]num){
        int l=0, r = num.length-1;
        while (l<r){
            while (num[l]<0)l++;
            while (num[r]>=0)r--;

        if (l<r){
            int temp =num[l];
            num[l] =num[r];
            num[r] =temp;
        }
    }}
    public static void main(String[] args) {
        int [] num ={-12,-10,14,17,-15,-3,4,6};
        partition(num);
        display(num);
    }
}
