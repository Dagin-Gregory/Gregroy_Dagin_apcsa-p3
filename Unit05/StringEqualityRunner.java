//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		  StringEquality dag = new StringEquality();
		  
		  Scanner keyboard = new Scanner(System.in);
		  System.out.println("Enter a string for string one:: ");
		  String one = keyboard.next();
		  System.out.println("Enter a string for string two:: ");
		  String two = keyboard.next();
		  dag.setWords(one, two);
		  dag.checkEquality();
		  System.out.println(dag.toString());
		
	}
}