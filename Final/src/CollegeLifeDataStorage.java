/** Application Purpose: Data storage class for collegeLife method
* Author: Yunna Jang
* Date: 10/12/2020
* Time: 6:50PM
*/
public class CollegeLifeDataStorage {
	//Instance variable
	private int score;
	private int sdfs;
	
	//Constructor
	public CollegeLifeDataStorage(int score)
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