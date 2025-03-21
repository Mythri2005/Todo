package Recursion;

public class msg {
    public static void main(String[] args){
        msg();
    }
    static void msg(){
        System.out.println("Hello Mythri");
        msg1();
    }
    static void msg1(){
        System.out.println("Hello Mythri");
        msg2();
    }
    static void msg2(){
        System.out.println("Hello Mythri");
        msg3();
    }
    static void msg3(){
        System.out.println("Hello Mythri");
        //msg1();
    }
}
