//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isEven( int num )
	{
		return (num % 2 == 0);
		
		/*
		if(num % 2 == 0) {{
			return true;
		}
		else
		{
			return false;
		}
		*/
	}
	
	public static boolean isOdd( 
			int num )
	{
		return (num % 2 != 0);
		
		/*
		if(num % 2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		*/
	}
}