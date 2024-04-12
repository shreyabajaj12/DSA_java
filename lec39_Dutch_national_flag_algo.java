package shreya.java;

public class lec39_Dutch_national_flag_algo {
    static void display(int[]num){
        for (int val:num
             ) {
            System.out.print(val+" ");

        }
    }
    static void swap(int[]arr ,int x,int y){
        int temp =arr[x];
        arr[x] =arr[y];
        arr[y] =temp;
    }
    static void sort012 (int[]a){
        int lo =0,mid =0,high = a.length-1;

        //explore the unknown region
        while (mid < high) {
        if(a[mid] ==0){
            swap(a,mid,lo);
            mid++;lo++;
        } else if (a[mid]==1) {
            mid++;

        }
        else {swap(a,mid,high);
            high--;

        }
        }}
    public static void main(String[] args) {
     int[]num ={2,2,1,1,0,0,2,2,1,1};
     sort012(num);
     display(num);

    }
}
