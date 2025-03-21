package CNS_Internal;

import java.util.Scanner;
public class CeaserCipher {
    public static String ecrypt(String text, int k){
        StringBuilder res = new StringBuilder();
        k = k % 26;
        for(char c: text.toCharArray()){
            if(Character.isUpperCase(c)){
                char encryptedchar = (char)('A'+(c-'A' + k) % 26);
                res.append(encryptedchar);
            } else if (Character.isLowerCase(c)) {
                char encryptedchar = (char)('a' + (c - 'a' + k) % 26);
                res.append(encryptedchar);
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }
    public static String decrypt(String text, int k){
        return ecrypt(text, 26 - (k % 26));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        System.out.println("Enter Shift value: ");
        int k = sc.nextInt();

        String encrypted_text = ecrypt(text,k);
        System.out.println("Encrypted_text: "+encrypted_text);
        String decryptedText = decrypt(text, k);
        System.out.println("Decrypted_text: " + decryptedText);
    }
}
