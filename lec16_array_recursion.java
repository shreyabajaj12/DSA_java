package shreya.java;

public class lec16_array_recursion {
//    static void printarray (int []arr,int idx){
//        if(idx == arr.length)return;
//        System.out.println(arr[idx]);
//        printarray(arr,idx +1);
//    }
//    static int maxinarray(int[]arr,int idx){
//        if(idx ==arr.length-1){
//            return arr[idx];
//        }
//        int smallans =maxinarray(arr,idx+1);
//        return Math.max(arr[idx],smallans);
//    }
    static int sum (int []arr ,int idx) {
        if (idx == arr.length) {
            return 0;
        }
        int smallans = sum(arr, idx + 1);
        return smallans + arr[idx];
    }
    public static void main(String[] args) {
        int [] arr ={1 ,2,-10,4};
//        printarray(arr,0);
//        System.out.println(maxinarray(arr,0));
        System.out.println(sum(arr,0));
    }
}
