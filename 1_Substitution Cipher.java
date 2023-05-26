import java.util.*;

class a2_substitutionCipher 
{

    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in))
         {
            System.out.println("Press 1 for AND and 2 for XOR:");
            int press = scanner.nextInt();
            scanner.nextLine(); 
            if(press == 1)
            {
                System.out.print("Enter the string to be ciphered: ");
                String message = scanner.nextLine();  
   
                StringBuilder encrypted = new StringBuilder();
                for (int i = 0; i < message.length(); i++) 
                {
                    char c = message.charAt(i);
                    int encryptedValue = c & 45; 
                    encrypted.append((char) encryptedValue); 
                }
   
      
                System.out.println("Encrypted message: " + encrypted.toString());
            } 
            else if(press == 2)
            {
                System.out.println("enter the text"); 
                String plaintext = scanner.nextLine();
                String ciphertext = "";

   
                for (int i = 0; i < plaintext.length(); i++) 
                {
                    char c = plaintext.charAt(i);
                    char xor = (char) (c ^ 45);
                    ciphertext += xor;
                }
   
                System.out.println("Plaintext: " + plaintext);
                System.out.println("Ciphertext: " + ciphertext);
            } 
            else
            {
                System.out.println("Error-404!");
            }
        }
    }
}
