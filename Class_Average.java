/**Simple Program that calculates the grade of a user
 * Sentinel based loop (-1)*/

//Imports
import java.util.Scanner;

public class Class_Average //Beginning of Class
{
	public static void main(String[] args) //Beginning of Main
	{
		//Declarations
		int total=0;
		int count=0;
		
		//Create the Scanner
		Scanner input= new Scanner(System.in);
	
	
		//PromptUsser
		System.out.println("Enter the first grade or press -1 to quit");
		int grade= input.nextInt();
		
		
		while(grade!=-1)
		{	
			total=grade+total;
			count=count+1;
			System.out.println("Enter an additional grade");
			grade=input.nextInt();
		}
		
	System.out.printf("Total:%d\n",total);	
	System.out.println("Program terminated");

	}//End of main

}//End of class
