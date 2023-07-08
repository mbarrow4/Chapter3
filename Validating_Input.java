/**Program that stops when 1 or two is entered*/

//imports
import java.util.Scanner;

public class Validating_Input 
{
	public static void main(String[] args) 
	{
		/**Input Block*/
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number");
		int number =input.nextInt();
		
		/**While Loop*/
		while(number !=1) 
		{
			while(number !=2) 
			{
				System.out.print("Enter a number");
				number =input.nextInt();
				int scope=0;
			}
		}
	
	}//End of Main

}//End of Class
