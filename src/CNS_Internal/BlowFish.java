package CNS_Internal;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;
public class BlowFish {
    public static void main(String[] args) throws Exception{
        KeyGenerator keyGenerator = KeyGenerator.getInstance("BlowFish");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();
        String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
        System.out.println("Generated Key: " + encodedKey);
        String plainText = "hello World";
        Cipher cipher = Cipher.getInstance("BlowFish");
        cipher.init(Cipher.ENCRYPT_MODE,secretKey);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes("UTF-8"));
        String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println("EncryptedText " + encryptedText);
        cipher.init(cipher.DECRYPT_MODE,secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        String decryptedText = new String(decryptedBytes,"UTF-8");
        System.out.println("DecryptedText:" + decryptedText);
    }
}