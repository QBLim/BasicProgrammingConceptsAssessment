import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DogGenetics {


	public static void main(String[] args) {
		
		Scanner readerInput = new Scanner(System.in);		
		String name;
		
		System.out.print("What is your dog's name? ");
		name = readerInput.nextLine();
		
		System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
		System.out.println("\n" + name + " is:\n");
		
		Random random = new Random();	
		int sum = 0;
		int dna1 = 0;
		int dna2 = 0;
		int dna3 = 0;
		int dna4 = 0;
		int dna5 = 0;
		
		while(sum != 100) {
			dna1 = random.nextInt(100);
			dna2 = random.nextInt(100 - dna1);
			dna3 = random.nextInt(100 - dna2);
			dna4 = random.nextInt(100 - dna3);
			dna5 = random.nextInt(100 - dna4);
			sum = dna1 + dna2 + dna3 + dna4 + dna5;
		}
	
		System.out.println(dna1 + "% St. Bernard");	
		System.out.println(dna2 + "% Chihuahua");
		System.out.println(dna3 + "% Dramatic RedNosed Asian Pug");
		System.out.println(dna4 + "% Common Cur");
		System.out.println(dna5 + "% King Doberman");			
		System.out.println("\nWow, that's QUITE the dog!"); 
		
	}

}


