/** Application Purpose: Create a data storage class for internLife method
* Author: Yunna Jang
* Date: 10/12/2020
* Time: 9:40PM
*/
public class InternLifeDataStorage {
	//Instance variable
	private int score;
	
	//Constructor
	public InternLifeDataStorage(int score)
	{
		this.score = score;
	
	}
	
	//Setter for score
	public void setScore(int score)
	{
		this.score = score;
	}
	//Getter for score
	public int getScore()
	{
		return score;
	}
}
