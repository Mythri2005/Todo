package Patterns;

public class Triangle1 {
    public static void main(String[] args){
        triangle(10,0);
    }
    static void triangle(int row,int col){
        if(row == 0){
            return;
        }
        if(col < row){
           // System.out.print("* ");
            triangle(row,col+1);
            System.out.print("* ");
        }else{
            //System.out.println();
            triangle(row -1,0);
            System.out.println(" ");
        }
    }
}
