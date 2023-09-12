import java.util.Scanner;

public class stringEncrypt {
    public static void main(String[] args) {
  
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.print("\n\nPlease enter a string: ");
            String inputString = userInput.nextLine();

            System.out.print("\n\nPlease enter a Key: ");
            int key = userInput.nextInt();
            
            // Consume the newline character left in the input buffer
            userInput.nextLine();

            System.out.println("\nYou entered String: " + inputString + "\n");
      
            System.out.println("\nYou entered Key: " + key + "\n");

            String encryptString = "";

            for (int i = 0; i < inputString.length(); i++) {
                char ch = inputString.charAt(i);
                encryptString += (char) (ch + key);
            }

            System.out.println("\nYou Encrypted String is : " + encryptString);
      
            System.out.println("\nDo you want to Decrypt It or not  [y/n]: ");
    
            char flag = userInput.nextLine().charAt(0);
            
            String decryptString = "";
      
            if(flag == 'y'){

            for (int i = 0; i < encryptString.length(); i++) {
      
              char ch = encryptString.charAt(i);
              decryptString += (char) (ch - key);
            }

            System.out.println("\nYour decrypted String is : " + decryptString);
           
           }
           else {
                break;
           } // end of if-else
      
           System.out.println("\nDo you want to continue  [y/n]: ");
      
           flag = userInput.nextLine().charAt(0);

           if (flag != 'y') {
                break;
           }
        } while (true);
    
         userInput.close();
    }
}
