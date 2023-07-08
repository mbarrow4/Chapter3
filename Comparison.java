/**This program obtains two numbers from user,
 * compares the number then output which number is larger*/

//Import Scanner Method

import java.util.Scanner;


/**Program Compares two numbers from user*/
public class Comparison //Class Declaration
{

	public static void main(String[] args) //main method begins execution of program
	{
		//Creates the Scanner object to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		//Prompt
		System.out.println("Enter first integer: ");
		int number1=input.nextInt();//reads first number
		
		System.out.println("Enter second integer: ");
		int number2=input.nextInt();//reads second number
		
		/**FINDS THE LARGEST NUMBER************************************/
		//Condition Statement
		if(number1> number2) 
		{
			System.out.println("The first number is LARGER");
		}
		else
		{
			System.out.println("The second number is LARGER");
		}
		
		/**FINDS THE SMALLEST NUMBER************************************/
		//Condition Statement
		if(number1< number2) 
		{
			System.out.println("The first number is SMALLER");
			}
		else
		{
			System.out.println("The second number is SMALLER");
		}
	}//end of main

}//end of Class
