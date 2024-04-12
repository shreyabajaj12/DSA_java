package shreya.java;

public class lec93_backtracking {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
//        int count=maze(1,1,rows,cols);
//        System.out.println(count);
        prin(1, 1, rows, cols,"");
    }
    private static void prin(int sr,int sc,int er,int ec,String s){
        if(sr>er||sc>ec)return ;
        if(sr==er&&sc==ec){
            System.out.println(s);
            return;
        }
        prin(sr+1,sc,er,ec,s+"R");
        prin(sr,sc+1,er,ec,s+"D");
    }



    private static int maze(int sr, int sc, int er, int ec) {
        if(sr>er||sc>ec)return 0;
        if(sr==er&&sc==ec)return 1;
        int downways=maze(sr+1,sc, er,ec);
        int rightways=maze(sr,sc+1,er,ec);
        int total_ways=downways+rightways;
        return total_ways;
    }

}
