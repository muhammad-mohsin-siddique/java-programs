import java.util.Scanner;

public class FahrenheitToCelsius {

    public double fahrenToCelsius(double fahrenheitTemperature) // method that calculate the value and return the result 
    {
    
        return ((5.0/9.0) * (fahrenheitTemperature - 32.0));
    
    }

    public static void main(String[] args) {
  
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("\nEnter Fahrenheit Temperature: ");
        
        double fahrenheit = userInput.nextDouble();

        FahrenheitToCelsius Main_class_object = new FahrenheitToCelsius(); // creat an object of main class to access  methods
    
        double celsius = Main_class_object.fahrenToCelsius(fahrenheit);
    
        System.out.println("Fahrenheit Temperature = " + fahrenheit + " and " + "Convert into Celsius = " + celsius);

        userInput.close();
    }
}