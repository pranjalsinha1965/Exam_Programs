package ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;

// create student class.
class StudentManagement extends Exception
{  
	StudentManagement(String error)
    {
		super(error);
	}
}

public class MyException
{    
	public static void main(String arg[])
    { 
		try
		{
			// create object of scanner class.
			Scanner KB=new Scanner(System.in);
			
			// enter marks between 1-100.
			System.out.print("Enter marks here : ");
			int h=KB.nextInt();
			
			// condition for checking valid entry of marks.
			if(!(h>=0 && h<=100))
			{
				throw(new StudentManagement("Invalid marks:"+h));
			}
			
			System.out.print("Entered marks are : " + h);			
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input..Pls Input Integer Only..");
		}
		catch(StudentManagement e)
		{
			System.out.println("Error:"+e);
		}
	}
}
