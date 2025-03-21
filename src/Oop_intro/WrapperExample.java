package Oop_intro;

public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        Integer num = 45;
        swap(a,b);
        System.out.println(a + " " + b);
    }
   static void swap (Integer a,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
