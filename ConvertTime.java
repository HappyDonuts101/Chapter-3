import java.util.Scanner; 

public class ConvertTime {

	public static void main(String[] args) {

		int time, hour, seconds, minutes;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer: " );
		time = in.nextInt();
		hour = time/3600;
		minutes = (time%3600)/60;
		seconds = (time%3600)%60;
		System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", time, hour ,minutes, seconds);
    }

}
