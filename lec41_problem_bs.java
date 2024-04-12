package shreya.java;

public class lec41_problem_bs {
    static int firstoccurance(int[]a,int x) {
        int n = a.length;
        int st = 0, end = n - 1;
        int fo = -1;  //first occurance
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (a[mid] == x) {
                fo = mid;
                end = mid - 1;

            } else if (x < a[mid]) {
                end = mid - 1;

            } else {
                st = mid + 1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int []a ={5,5,5,5,2,2,3,3,6};
        int x =5;
        System.out.println(firstoccurance(a,x));
    }
}
