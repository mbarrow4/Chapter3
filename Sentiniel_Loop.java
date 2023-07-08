/**Simple program that demonstrates a sentinel based loop*/
//IMPORTS
import java.util.Scanner;

public class Sentiniel_Loop //Class Declaration 
{
	
	public static void main(String[] args) //main method begins execution of program
	{
		/**INPUT*/
		//Start up Scanner
		Scanner input = new Scanner(System.in);
		//Prompt
		System.out.println("Please enter a number: ");//printf METHOD
		//Input
		double num = input.nextDouble();
		
		
		/**SENTINEL BASED WHILE LOOP*/
		double sum= 0;
		//A loop stops at sentinel value (-1)
		int sentinel = -1;
		while(num != sentinel)
		{
			sum= sum + num;
			System.out.println("Please Enter a number: ");//printf METHOD
			//Input
			num = input.nextDouble();
		}//end of while loop
		
		System.out.println("Your Total is: " + sum);//printf METHOD

	}//end of main

}//end of class
