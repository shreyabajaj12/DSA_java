package shreya.java;

public class lec94_4dir_maze_backtracking {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        boolean [][]isVisisted=new boolean[rows][cols];
        prin(0, 0, rows-1, cols-1,"",isVisisted);
    }
    private static void prin(int sr,int sc,int er,int ec,String s,boolean[][]isVisisted){
        if(sr<0||sc<0)return;
        if(sr>er||sc>ec)return ;
        if(isVisisted[sr][sc]==true)return;
        if(sr==er&&sc==ec){
            System.out.println(s);
            return;
        }
        isVisisted[sr][sc]=true;
        //go right
        prin(sr+1,sc,er,ec,s+"R",isVisisted);
        //go down
        prin(sr,sc+1,er,ec,s+"D",isVisisted);
        //go left
        prin(sr,sc-1,er,ec,s+"L",isVisisted);
        //go right
        prin(sr-1,sc,er,ec,s+"R",isVisisted);
        //backtracking
        isVisisted[sr][sc]=false;

    }




}
