package shreya.java;

public class lec32_quick_sort {
    static  void displayArr(int[]arr){            //time complexity best case is o(nlogn) and in worst case it is n^2 which is mostly avoided by ramdomize
        for (int val:arr
             ) {
            System.out.print(val+" ");

        }}


    static void swap (int[] arr, int x , int y){
        int temp =arr[x];
        arr[x] =arr[y];
        arr[y] =temp;
    }
    static int partition(int[]arr ,int st ,int end){
        int pivot =arr[st];
        int cnt =0;
        for(int i = st+1;i<=end;i++){
            if(arr[i] <= pivot)
                cnt++;
        }
        int pivotindex =st +cnt;
        swap(arr,st,pivotindex);
        int i =st , j=end;

        //element lesser or equal comes to the left of pivot and greater than comes to right of it
        while (i<pivotindex && j>pivotindex){
            while (arr[i]<=pivot)i++;
            while (arr[j]>pivot)j--;
        if(i<pivotindex && j > pivotindex){
            swap(arr,i,j);
            i++;
            j--;
        }
        }
        return pivotindex;
    }
    static void quicksort(int[]arr,int st,int end){
        if(st>=end) return;
        int pi =partition (arr,st,end);
        quicksort(arr ,st,pi-1);
        quicksort(arr ,pi+1,end);
    }
    public static void main(String[] args) {
        int []arr = {6,7,4,3,7,0};
        System.out.println("Array before sorting");
        displayArr(arr);
        System.out.println();
        quicksort(arr,0, arr.length-1);


        System.out.println("Array after sorting");
        displayArr(arr);


    }
}
