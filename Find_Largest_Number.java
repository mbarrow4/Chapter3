/**Program that finds the largest number in a while loop*/
//Imports
import java.util.Scanner;

public class Find_Largest_Number 
{
	public static void main(String[] args) 
	{
		//Declarations
		int count=0;
		int largest_num=0;
		
		/**INPUT*BLOCK**********************************************************/
		//Scanner
		Scanner input = new Scanner(System.in);
		//Prompt
		System.out.print("Enter a number");
		//Input
		int number1= input.nextInt();
		
		/**INPUT*BLOCK**********************************************************/
		while(count<=5)
		{
			System.out.print("Enter a number");
			int number2= input.nextInt();
			count++;
			
			if (number1>number2)
			{
				largest_num = number1;
			}
			else
			{
				largest_num = number2;
			}//End of If
		}//End of While
		System.out.printf("The Largest Number: %d\n", largest_num);
		
	}//End of Main
}//End of Class
