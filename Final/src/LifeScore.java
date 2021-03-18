/** Application Purpose: Create college life and intern life system that needs to play life adventure game
* Author: Yunna Jang
* Date: 9/12/2020
* Time: 9:50AM
*/
import java.util.Scanner;
public class LifeScore {
	// Static variables 
	public static String[] questionsArray1 = {"Replace 'n' with 's' of the following word", "Capitalize the following word", "Substring the following word from index 2 to index 4"}; 
	public static String[] questionsArray2 = {"mountain", "original", "hellojava"};
	public static String[] answersArray = {questionsArray2[0].replace('n', 's'), questionsArray2[1].toUpperCase(), questionsArray2[2].substring(2, 5)};
	public static String[] workRecordQuestions = {"Did you come to work on time?", "Have you completed your quota?"};
	public static int[][] workRecordArray = new int[3][2];
	public static int wow = 5;
	//Create college life method
	public static CollegeLifeDataStorage collegeLife()
	{
		//Initialize the college score
		int collegeScore = 0;
		
		//Make a Scanner object
		Scanner in = new Scanner(System.in);
		
		//Ask the user about studying for exam
		System.out.println("You have an exam tomorrow. Will you study for this?");	
		System.out.println("1.No 2.Roughly 3.Hard");
		
		//Take user answer
		int answer = in.nextInt();
		
		//Increase totalScore depend on the answer
		switch(answer)
		{
			//If the user select 1, decrease the score by -3
			case 1:
				collegeScore = collegeScore - 3;
				System.out.println("Your college score has decreased by 3 points.");
				break;
			//If the user select 2, increase the score by 1
			case 2:
				collegeScore = collegeScore + 1;
				System.out.println("Your college score has increased by 1 points.");
				break;
			//If the user select 3, increase the score by 5
			case 3:
				collegeScore = collegeScore + 5;
				System.out.println("Your college score has increased by 5 points.");
				break;
		}
		
		//Have the user take exam
		System.out.println("");
		System.out.println("It's time for your exam");
		System.out.println("Answer properly on each question");
		System.out.println("");
		
		//Make a Scanner object
		Scanner in2 = new Scanner(System.in);
		
		//Iterate through each question and check the user answer
		int i=0;
		while(i<3) 
		{
			//Print out each question
			System.out.println((i+1) + ". " + questionsArray1[i] + ": " + questionsArray2[i]);
			//Save the user's answer
			String questionAnswer = in2.nextLine();
			//Check if user answer is right
			if(questionAnswer.equals(answersArray[i]))
			{
				collegeScore = collegeScore + 10;
				System.out.println("Correct answer! Your college score has increased by 10 points.");
				System.out.println("");
			}
			else 
			{
				collegeScore = collegeScore - 5;
				System.out.println("Wrong answer. Your college score has decreased by 5 points.");
				System.out.println("");
			}
			
			//Increase i by 1
			i++;
		}
		
		//Make a Scanner object
		Scanner in3 = new Scanner(System.in);
		//Inform the user that the college life is over
		System.out.println("Your college life is over!");
		//Inform the user of total college score
		System.out.println("Your college score is " + collegeScore);
		
		//Make an object of CollegeLifeDataStorage 
		CollegeLifeDataStorage cl = new CollegeLifeDataStorage(collegeScore);
		//return CollegeLifeDataStorage object
		return cl;
	}

	//Create intern life method
	public static InternLifeDataStorage internLife()
	{
		//Initialize the intern score
		int internScore = 0;
		
		//Make a Scanner object
		Scanner in4 = new Scanner(System.in);
		
		//Iterate through the workRecordArray 
		for(int i=0; i<3; i++)
		{
			System.out.println("");
			System.out.println("This is " + (i+1) + "th day of your internship");
			System.out.println("");
			//Have the user record if they work properly
			for(int j=0; j<2; j++)
			{
				System.out.println(workRecordQuestions[j]);
				System.out.println("Yes: enter 1, No: enter 0");
				workRecordArray[i][j] = in4.nextInt();
			}
		}
		
		//Calculate the elements of workRecordArray
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++)
			{
				//If the user answered yes, increase the internScore by 2
				if(workRecordArray[i][j] == 1)
				{
					internScore = internScore + 2;
				}
				//If the user answered no, decrease the internScore by 2
				else
				{
					internScore = internScore - 2;
				}
			}
		}
		
		//Have the user take promotion examination
		System.out.println("");
		System.out.println("It's time for your promotion examination.");
		//Create Wrapper class object
		Integer int1 = new Integer(45);
		Integer int2 = new Integer(30);
		Integer int3 = new Integer(28);
		//Make a Scanner object
		Scanner in5 = new Scanner(System.in);
		
		//Do-while method for promotion examination
		int i = 0;
		do
		{
			System.out.println("What is " + int1 + " + " + int2 + " + "+ int3 + "?");
			//Check if the answer is right
			if(in5.nextInt() == 103)
			{
				internScore = internScore + 10;
				System.out.println("You got the right answer! Congratulations");
				i = 1;
			}
			//If the answer is wrong, the loop will be executed again
			else
			{
				internScore = internScore -5;
				System.out.println("You got the wrong answer. You must try again");
			}
		} while(i == 0);
		
		//Have the user do the project
		System.out.println("");
		System.out.println("This is project time. What is the index of 10th letter of the word 'powerpoint'?");
		Scanner in6 = new Scanner(System.in);
		//Try the charAt() method with the user answer
		try {
			String str = "powerpoint";
			int index = in6.nextInt();
			char c = str.charAt(index);
			if(index == 9)
			{
				System.out.println("");
				System.out.println("You got the right answer!");
				internScore = internScore + 7;
			}
		}
		//Go to here if the string index is out of bounds
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("");
			System.out.println("String index is out of bound. You got the wrong answer");
		}
		
		//Make a Scanner object
		Scanner in7 = new Scanner(System.in);
		//Inform the user that the college life is over
		System.out.println("");
		System.out.println("Your intern life is over!");
		//Inform the user of total college score
		System.out.println("Your intern score is " + internScore);	
				
		//Make an object of InternLifeDataStorage 
		InternLifeDataStorage il = new InternLifeDataStorage(internScore);
		//return InternLifeDataStorage object
		return il;
		
	}
	
	//Overloaded method for setting a goal
	public static void goal(int collegeScore, int internScore)
	{
		int totalScore = collegeScore + internScore;
		System.out.println("");
		System.out.println("Your goal of total score is " + totalScore);
	}
	//Overloaded method for setting a goal
	public static void goal(String str)
	{
		System.out.println("Your resolution for the next playing is: " + str);
	}
}
