import java.util.Scanner;

public class Temperature{

    public static void main (String[] args) {
	
        double celsius;
        double farenheit;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius:" );
        celsius = in.nextDouble();
        
        farenheit = celsius * 9/5 + 32;
        System.out.printf("%.1f C = %.1f F", celsius, farenheit);  
    }
}

