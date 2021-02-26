/** Application Purpose: Create a class to execute methods in LifeScore and get data from DataStorage classes
* Author: Yunna Jang
* Date: 10/12/2020
* Time: 11:42AM
*/
import java.util.Scanner;
public class LifeScoreTestHarness {
	public static void main(String[] args)
	{
		// Explain about the game to user
		System.out.println("Welcome to the LIFE ADVENTURE game.");
		System.out.println("From now on, you will experience college and internship.");
		System.out.println("How faithfully you work and earn points will determine your final salary.");
		System.out.println("Let's start the game.");
		
		// Level of college
		System.out.println("---------------------------------");
		System.out.println("College Life");
		System.out.println("");
		CollegeLifeDataStorage cl = LifeScore.collegeLife();
		
		// Level of intern
		System.out.println("---------------------------------");
		System.out.println("Intern Life");
		InternLifeDataStorage il = LifeScore.internLife();
		System.out.println("---------------------------------");
		
		//Announcement the salary
		int totalScore = cl.getScore() + il.getScore();
		if(totalScore > 30)
		{
			System.out.println("Your salary is 60000 dollars");
		}
		else if(totalScore > 10 && totalScore <= 30)
		{
			System.out.println("Your salary is 40000 dollars");
		}
		else
		{
			System.out.println("Your salary is 20000 dollars");
		}
		
		System.out.println("");
		
		//Have the user set a new goal for next time playing
		System.out.println("Are you satisfied with your salary? Set a new goal for next time");
		Scanner input = new Scanner(System.in);
		System.out.println("What's the goal for college score?");
		int collegeScore = input.nextInt();
		System.out.println("What's the goal for intern score?");
		int internScore = input.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.println("");
		System.out.println("Type the resolution for the next playing");
		String resolution = input2.nextLine();
		
		//Execute two overloaded methods with user input
		LifeScore.goal(collegeScore, internScore);
		LifeScore.goal(resolution);
		
		//Inform the user that game is over
		System.out.println("---------------------------------");
		System.out.println("The game is over. Thank you for playing");
	}
}
