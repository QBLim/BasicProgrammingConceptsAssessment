import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner readerInput = new Scanner(System.in);
		Random random = new Random();
		String play;
		boolean run = true;
		int roundNum, choiceNum;
		int tieScore = 0;
		int userScore = 0;
		int myScore = 0;
		
		System.out.println("=====================================================");
		System.out.println("Let's Play Rock Paper Scissors!");
		System.out.println("=====================================================");
		System.out.print("How many rounds you want to play? ");
		roundNum = Integer.parseInt(readerInput.nextLine());
	
		if (roundNum >= 1 && roundNum <= 10) {
			System.out.println("\nLet's play for " + roundNum + " rounds!");
		} 	else {
				System.out.println("\nError!!! Please choose from 1 to 10!");
				System.exit(0);
			}
		
		for(int i = 1; i <= roundNum; i++) {
			System.out.println("\nRound " + i + ":  1 = Rock, 2 = Paper, 3 = Scissors");
			System.out.println("What is your choice? ");
			choiceNum = Integer.parseInt(readerInput.nextLine());
			
			while (run) {
			if (choiceNum < 1 || choiceNum > 3){				
				System.out.println("Error!!! Please choose again from 1 to 3!");
				choiceNum = Integer.parseInt(readerInput.nextLine());
				run = true;
				continue;
			} 	else {
					if (choiceNum == 1){
						System.out.println("You have chosen "+ choiceNum + " for ROCK");			
					} 
					if (choiceNum == 2){
						System.out.println("You have chosen "+ choiceNum + " for PAPER");
					} 
					if (choiceNum == 3){
						System.out.println("You have chosen "+ choiceNum + " for SCISSORS");
					}
				} break;
			} 
			
			int randomNum = random.nextInt(1,4);
			if (randomNum == 1){
				System.out.println("My choice is " + randomNum + " for ROCK");				
				} 
				if (randomNum == 2){
				System.out.println("My choice is " + randomNum + " for PAPER");
				} 
				if (randomNum == 3){
				System.out.println("My choice is " + randomNum + " for SCISSORS");
				}
			
			if (choiceNum == randomNum) {
				System.out.println("Result for round " + i + " : TIE");
				tieScore = tieScore + 1;
			} 	else {
					if ((choiceNum == 2 && randomNum == 1)||
						(choiceNum == 3 && randomNum == 2)||
						(choiceNum == 1 && randomNum == 3)) {
						System.out.println("Result for round " + i + " : YOU WIN!");
						userScore = userScore + 1;
					}
					if ((choiceNum == 1 && randomNum == 2)||
						(choiceNum == 2 && randomNum == 3)||
						(choiceNum == 3 && randomNum == 1)) {
						System.out.println("Result for round " + i + " : I WIN!");
						myScore = myScore + 1;
					}					
				}			
		}		
	
		System.out.println("\nResult for " + roundNum + " rounds:" );
		System.out.println("You win: " + userScore);
		System.out.println("I win: " + myScore);
		System.out.println("Tie: " + tieScore + "\n");
		
		if (userScore == myScore) {
			System.out.println("There are no winner!!!");
		} 	else {
				if (userScore > myScore) {
					System.out.println("Congratulations! You are the overall winner!");
				}
				if (userScore < myScore) {
					System.out.println("I'm the overall winner!");
				}
			}
		
		System.out.println("\nLet's play again? Y / N");
		play = readerInput.nextLine();
		if (play.equalsIgnoreCase("N")) {
			System.out.println("=====================================================");
			System.out.println("Thanks for playing!");
			System.out.println("=====================================================");
			System.exit(0);
			
		} 	else {
				main(args);
			}
					
	} //main

} //class
