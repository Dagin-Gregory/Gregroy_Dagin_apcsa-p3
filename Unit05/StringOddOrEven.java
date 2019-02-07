//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private static String word;

	public StringOddOrEven()
	{
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven(String s)
 	{
 		return( word.length() % 2 == 0 );
	}

 	public String toString()
 	{
 		String output = ("Is your string even in length? :: " + isEven(word));
		return output;
	}
}