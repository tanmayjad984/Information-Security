/*  Write Java/Python/C++ code to implement DES Encryption Algorithm.   #####

DesEncryption.java*/

import java.util.*;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

public class DesEncryption {
    public static void main(String[] args) throws Exception {
        // Generate a secret key for DES algorithm
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
        SecureRandom secureRandom = new SecureRandom();
        keyGenerator.init(secureRandom);
        SecretKey secretKey = keyGenerator.generateKey();
        // Convert the secret key to bytes
        byte[] keyBytes = secretKey.getEncoded();
        // Create a SecretKeySpec object from the key bytes
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "DES");
        // Create a Cipher object and initialize it with the secret key
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        // Encrypt the message
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plaintext");
        String message = sc.nextLine();
        byte[] encryptedMessageBytes = cipher.doFinal(message.getBytes());
        // Print the encrypted message
        System.out.println("Encrypted Message: " + new String(encryptedMessageBytes));
        // Initialize the Cipher object for decryption
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        // Decrypt the message
        byte[] decryptedMessageBytes = cipher.doFinal(encryptedMessageBytes);
        // Print the decrypted message
        System.out.println("Decrypted Message: " + new String(decryptedMessageBytes));
    }
}
