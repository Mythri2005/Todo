package Recursion;

public class PassingNum {
    public static void main(String[] args){
       // System.out.println(concept(5));
    concept(5);
    }
    static void concept(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        concept(--n);// differnece between --n and n--
    }
}
