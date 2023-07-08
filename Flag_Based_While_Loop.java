/**A simple program that demonstrates a flag based loop (1 for user to continue)*/
//Imports
import java.util.Scanner;

public class Flag_Based_While_Loop //Class Declarations
{

	public static void main(String[] args) //main method begins execution of program
	{
	/**declarations*/
	double sum = 0;
	boolean flag = true;
	int count = 0;
	
	
	
	/**Input and Prompt*/
	//Scanner start up 
	Scanner input = new Scanner(System.in);
	//prompt
	System.out.println("Please Enter a grade: ");
	//Input
	double num = input.nextDouble();
	
	
	/**Flag based loops must have an "if" condition within the loop*/
	//flag based while loop
		while(flag) 
		{
			sum= sum + num;
			count++;
			
			//input
			System.out.println("Do you want to continue? Press one to continue ");//printf METHOD
			int choice = input.nextInt();
			if(choice == 1)
			{
				flag = true;
				System.out.println("Please Enter a grade: "); //printf METHOD
				//Input
				num = input.nextDouble();
				//function call
				System.out.println(num); //printf METHOD
				
			}
			else
			{
				flag = false;
				System.out.println("Terminated");//printf METHOD
			}
			
		}//end of while loop
		
		//Caculations
		double average = sum/count;
		System.out.println(average);//printf METHOD
		
	}//end of main

}//end of class
