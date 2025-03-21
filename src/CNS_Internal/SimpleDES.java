package CNS_Internal;

import java.util.Scanner;

public class SimpleDES {
    private static final int[][] S_Box = {
            {3,8,15,1},
            {10,6,5,11},
            {14,8,9,7},
            {2,12,4,13}
    };
    private static final int KEY = 0b1010;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a 4 bit binary msg:");
        String input = sc.next();

        //if(input.length() != 4 || !input.matches("[01] + ")){
          //  System.out.println("Invalid input! Please enter a 4-bit binary numberr.");
            //return;
        //}

        int msg = Integer.parseInt(input,2);
        System.out.println("Original msg: "+input);

        int encryptedMsg = encrypt(msg);
        System.out.println("Encrypted msg" + toBinaryString(encryptedMsg,4));

        int decryptedMsg = decrypt(encryptedMsg);
        System.out.println("Decrypted msg:" + toBinaryString(decryptedMsg,4));
        sc.close();
    }
    private static int encrypt(int msg){
        int XorRes = msg ^ KEY;
        int substituted = substitute(XorRes);
        return substituted ^ KEY;
    }

    private static int decrypt(int encryptedMsg){
        int XorRes = encryptedMsg ^ KEY;
        int reversedSubstitution = reversedSubstitute(XorRes);
        return reversedSubstitution ^ KEY;
    }
    private static int substitute(int value){
        int row = (value & 0b1100) >> 2;
        int col = value & 0b0011;
        return S_Box[row][col];
    }
    private static int reversedSubstitute(int value){
        for(int row = 0; row < S_Box.length;row++){
            for(int col = 0; col < S_Box[row].length;col++){
                if(S_Box[row][col] == value){
                    return(row << 2) | col;
                }
            }
        }
        return -1;
    }
    private static String toBinaryString(int value, int bits){
        return String.format("%"+bits+"s",Integer.toBinaryString(value)).replace(' ','0');
    }
}