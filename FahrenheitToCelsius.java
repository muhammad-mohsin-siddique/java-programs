import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
  
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("\nEnter Fahrenheit Temperature: ");
        
        double fahrenheit = userInput.nextDouble();
    
        double celsius = ((5.0/9.0) * (fahrenheit - 32.0));
    
        System.out.println("Fahrenheit Temperature = " + fahrenheit + " and " + "Convert into Celsius = " + celsius);
    
        System.out.println("\n" + 5/9);

        userInput.close();
    }
}