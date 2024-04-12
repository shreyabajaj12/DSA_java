package shreya.java;

public class lec36_problem_solving {
    static void sortarr (int[]num) {
        int n = num.length;
        int x = -1, y = -1;

        if(n<=1){
            return;
        }

        //process all adjacent elements
        for (int i = 1; i < n; i++) {
            if (num[i - 1] > num[i]) {
                if (x == -1) {                    //1st conflict
                    x = i - 1;
                    y = i;

                } else {                        //2nd conflict
                    y = i;
                }
            }
        }
        //swap x,y
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }
    static void displayarr(int[]num){
        for (int val: num
             ) {
            System.out.println(val);

        }
    }
    public static void main(String[] args) {
int [] num ={7,5,6,2,10,11};
sortarr(num);
displayarr(num);
    }
}
