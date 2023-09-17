import java.util.Scanner;

public class FootToMeters {
    public static void main(String[] args) {
  
        Scanner userInput = new Scanner(System.in);

        System.out.print("\nEnter a Number in Foot : ");
    
        double foot = userInput.nextDouble();

        double meter = foot * 0.305;
    
        System.out.println("\nFoot = " + foot + "\' converted into meters = " + meter + "m" );
        
        userInput.close();
    }
}