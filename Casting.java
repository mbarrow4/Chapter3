/**Program that declares a data type then casts it to another data type*/
public class Casting //Class Declaration
{

	public static void main(String[] args) //main method begins execution of program
	{
		/**THIS METHOD CATSTS A VARIABLE FROM A DOUBLE TO AN INTEGER*/
		 double myDouble = 9.78;
		 System.out.println(myDouble);//printf METHOD
		 int myInt = (int) myDouble;
		 System.out.println(myInt);
		
		 /**THIS METHOD CATSTS A VARIABLE FROM AN INTEGER TO A DOUBLE*/
		 int myInt1 = 7;
		 System.out.println(myInt1);//printf METHOD
		 double myDouble2 = (double)myInt1;
		 System.out.println(myDouble2);//printf METHOD

	}//end main

}//end class
