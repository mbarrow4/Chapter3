/**Program that calculates the commission of a salesperson*/

//Imports
import java.util.Scanner;


public class Sales_Commission_Calculator 
{
	public static void main(String[] args) 
	{
		//Declarations
		int count=0;
		double total=0;
		
		/**Input Block */
		//Scanner
		Scanner input= new Scanner(System.in);
		
		//Prompt
		System.out.println("Enter the price of the item");
		
		//Input Declaration
		double item = input.nextDouble();
		
		/**While Loop*/
		
		while(item !=0)
		{
			count=count++;
			total=total+item;
			
			System.out.println("Enter the price of the item");
			item = input.nextDouble();
			
			
		}//End of While
		double pay= 200+(.09*total);
		System.out.printf("Total Cost of items: %.2f\n", pay);
	}//End of Main 

}//End of Class
