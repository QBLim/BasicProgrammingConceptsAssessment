import java.util.Scanner;

public class HealthyHearts {

	public static void main(String[] args) {
		
		Scanner inputReader = new Scanner(System.in);
		int age, heartRate;
		double lowerHr, upperHr;
		
		System.out.print("What is your age? "); 
        age = Integer.parseInt(inputReader.nextLine());
        
        heartRate = 220 - age;
        System.out.println("Your maximum heart rate should be " + heartRate + " beats per minute."); 
        
        lowerHr = heartRate * 0.5;
        upperHr = heartRate * 0.85;
        System.out.println("Your target HR Zone is " + Math.round(lowerHr) + " - " + Math.round(upperHr) + " beats per minute.");

	}

}
