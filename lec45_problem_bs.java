package shreya.java;

public class lec45_problem_bs {
    public static boolean searchMatrix(int [][]a,int target){ //using binary search
        int n =a.length,m=a[0].length;
        int i =0,j =m-1;

        while (i<n && j>=0){
            if(a[i][j] == target)return true;
            if(target<a[i][j]){
                j--;//move left
            }else{
                i++; //move down
            }
        }
        return false;
    }
    public static void main(String[] args) {//arrays in 1st row lst element is bigger then 2nd col 1st element
        int [][]a ={{1,4,7,11,15},
                    {2,5,8,12,19}};
        int target =8;
        boolean found =searchMatrix(a,target);
        if (found) {
            System.out.println(target + "is found");
        }
        else {
            System.out.println("not found");}


        }

    }

