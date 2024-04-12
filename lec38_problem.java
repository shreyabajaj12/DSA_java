package shreya.java;

public class lec38_problem {
    static void sort123(int[]num){
        int count_0 =0 ,count_1 =0;
        int count_2 =0 ;
        for(int j :num){
            if(j==0){
                count_0++;
            } else if (j==1) {
                count_1++;

            } else  {
                count_2++;

            }
        }
        int k=0;
        while (count_0 >0){
            num[k++] =0;
            count_0--;              //till then the count of 0>0 arr stats filling and count dec as the n0.starts filling
        }

        while (count_1 >0){
            num[k++] =0;
            count_1--;
        }
        while (count_2 >0){
            num[k++] =0;
            count_2--;
        }
    }
    public static void main(String[] args) {
        int []arr={2,4,0,1,5};
        sort123(arr);
        for (int val:arr
             ) {
            System.out.println(val);

        }

    }
}
