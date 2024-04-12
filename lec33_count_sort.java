package shreya.java;

public class lec33_count_sort {
    static void display(int[]a){
        for (int val:a
        ) {
            System.out.print(val);
        }}

        static int findMax(int []arr){
        int max =Integer.MIN_VALUE;
        for(int i =0 ;i < arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void basiccountsort(int[]arr){
       int max = findMax(arr); //find the largest element of the array
      int[]count =new int [max +1];     //because we need +1 index box for the 0th index box as we are cal. for each no till the max no of the count
        for(int i=0;i< arr.length;i++){    //making array as like no are like 99,3,4,1,78 hence the max no is 99 so we have to max arr till 99+1 for the 0th element
            count[arr[i]]++;}
        int k =0;
        for(int i=0;i<count.length;i++){
            for(int j=0 ;j<count[i];j++){
                arr[k++] =i;
                
            }}}
    //-------------------------------------------------------------------------------------------------------next method with lesser time complexity
            static void countsort(int [] arr){
                int n = arr.length;
                int [] output =new int [n];
                int max = findMax(arr);
                int[]count =new int [max+1];
                for(int i=0;i< arr.length;i++){   //make frequency array
                    count[arr[i]]++;

                }
                //make prefix sum array of count array
                for(int i =1;i< count.length;i++){
                    count[i] += count[i-1];
                }
            //find the index of each element in the count array and put it in output array
            for(int i =n-1;i>=0;i--){                         //starting from back to maintain the stability in original array
                int idx = count[arr[i]]-1;  // count[arr[i]] is now a prefix sum array and it reads the lst position of the given no in arr
                output[idx] = arr[i];            //output of that particular index par dec wala arr i put kar do
                count[arr[i]]--;
            }
            //copy all elements of output to array
                for(int i =0;i<n;i++)
                    arr[i] =output[i];
        }



    public static void main(String[] args) {
        int[]arr ={2,4,1,5,3,3,4};
//        basiccountsort(arr);
        countsort(arr);
        display(arr);


    }
}
