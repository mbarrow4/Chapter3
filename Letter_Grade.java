/**A controlled Infinite Loop that continues to ask the user an integer*/

//Imports
import java.util.Scanner;

public class Infinite_Loop 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Type a number");
		int number= input.nextInt();
		
		while(number>= 0) {
			System.out.print("Type a number");
			number= input.nextInt();
			
		}

	}//End of Main

}//End of Class
