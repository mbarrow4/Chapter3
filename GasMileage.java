/**Program that calculates the gas mileage based on User's input*/

//Imports
import java.util.Scanner;

//Beginning of GasMileage Class
public class GasMileage 
{
	//Beginning of Main Method
	public static void main(String[] args) 
	{
		//Declarations
		int count=0;
		int total_gas=0;
		int total_miles=0;
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Gas Block
		System.out.println("Please enter gas: ");
		int gas=input.nextInt();
		
		//Miles Block
		System.out.println("Please enter mileage: ");
		int miles=input.nextInt();
		
		//While Loop
		while(gas!=-1 || miles !=-1) 
		{
			//Calculations
			count=count+1;
			total_gas=gas+total_gas;
			total_miles=miles+total_miles;
			
			//Input
			System.out.println("Please enter mileage again or press -1 to exit" );
			miles=input.nextInt();
			System.out.println("Please enter gas again: ");
			gas=input.nextInt();
		
			
			
		}
		
		//Output
		System.out.printf("Your gas is: %d\n",total_gas);
		System.out.printf("Your mileage is: %d\n",total_miles);
		

	}//End of Main

}//End of GasMilege Class
