package shreya.java;

public class lec29_insertion_sort {
    static void insertionSort(int []arr){
        int n = arr.length;
        for(int i=1;i<n;i++){       //we are traversing unsorted part of array and putting in correct position defining an array
            int j=i;               //j is a pointer that points which index.. j=i means while traversing the array many times the no which is at  wrong place here is 1 and then j--
            while (j>0 && arr[j]<arr[j-1]){
                //swap
                int temp =arr[j];
                arr[j] =arr[j-1];
                arr[j-1] =temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int []arr ={8,7,6,5,4,9};
        insertionSort (arr);
        for (int val:arr
             ) {
            System.out.println(val);

        }
    }
}
