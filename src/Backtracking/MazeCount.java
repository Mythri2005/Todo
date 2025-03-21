package Backtracking;

public class MazeCount {
    public static void main(String[] args){
        System.out.println(Count(3,3));
    }
    static int Count(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        int left = Count(row - 1,col);
        int right = Count(row, col - 1);
        return left + right;
    }
}
