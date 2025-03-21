package Recursion;

public class Nto1 {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        fun(5 );
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+ " ");
        fun(n - 1);
    }
}

