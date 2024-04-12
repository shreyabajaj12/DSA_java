package shreya.java;

public class lec34_radix_sort {
    static int findMax(int []arr){
        int max =Integer.MIN_VALUE;
        for(int i =0 ;i < arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void countsort(int [] arr,int place){
        int n = arr.length;
        int [] output =new int [n];
        int max = findMax(arr);
        int[]count =new int [10];
        for(int i=0;i< arr.length;i++){   //make frequency array
            count[(arr[i]/place)%10]++;  // because we want is the value of that certain place incs.

        }
        //make prefix sum array of count array
        for(int i =1;i< count.length;i++){
            count[i] += count[i-1];
        }
        //find the index of each element in the original array and put it in output array
        for(int i =n-1;i>=0;i--){                         //starting from back to maintain the stability
            int idx = count[(arr[i]/place)%10]-1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        //copy all elements of output to array
        for(int j =0;j<n;j++)
            arr[j] =output[j];
    }

    static void radixsort (int[]arr){
        int max =findMax(arr);     //to get the max value
        //apply counting sort to sort elements based on place value
        for(int place =1;max/place >0 ;place *=10){ // to identify the no of digits in each no max/place.
            countsort(arr,place);
        }
    }
    public static void main(String[] args) {  //based on the place value system
        int[] arr ={2,388,4,1,566,6,0};
        radixsort(arr);
        for(int val: arr){
            System.out.print(val +" ");

        }



    }}