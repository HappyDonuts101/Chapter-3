import java.util.Scanner;

public class Temperature {

public static void main (String[] args) {
	
	double celsius;
	double Farenheit;
	
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a temperature in Celsius:" );
	celsius = in.nextDouble();
	
	Farenheit = celsius * 9/5 + 32;
	System.out.printf("The temperature in farenheit is = %.1f" , Farenheit);

	}



}
