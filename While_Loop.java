/**A simple program that obtains that iterates through 10
 * and obtain user input to print out a number (controlled infintite loop) */


/**WHILE LOOP REQUIREMENTS*/
//Imports
import java.util.*;

public class While_Loop //Class Declaration
{

	public static void main(String[] args) //main method begins execution of program
	{
		/**COUNTER BASED While Loop*/
		//1. Initialized counter
		int count = 0;
		
		//2. User input (if applicable)
		
		//3. While loops with a condition
		while (count <= 10)
		{
			//4. Counter must increase or decrease
			count = count + 1;
			//5. User input must be asked again (if appliable)
			System.out.println(count);
		}
		
		/**REPETITION while loop with input*/
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			//Prompt 
			System.out.println("Type in a number");//printf METHOD
			//Assigns the input to 'd'
			int d = input.nextInt();
			//Prints d
			System.out.println(d);
		}//end of While

	}//end of main

}//end of class
