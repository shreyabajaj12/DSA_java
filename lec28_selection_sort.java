package shreya.java;

public class lec28_selection_sort {
    static void selectionSort(int[]arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){     //i represents the current index

            //find the min element in  the unsorted part of arr
            int minIndex  =i;
            for(int j=i+1 ;j<n ;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex =j;
                }
            }
            //swap curr element and min element
            int temp =arr[i];
            arr[i] =arr[minIndex];
            arr[minIndex] =temp;
        }
    }
    public static void main(String[] args) {
        int []arr ={5,6,7,2,1};
        selectionSort(arr);
        for (int i:arr
             ) {
            System.out.println(i);

        }

    }
}
