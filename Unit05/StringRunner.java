//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a string :: ");
		String dg = keyboard.next();
		StringOddOrEven dag = new StringOddOrEven(dg);
		dag.isEven(dg);
		System.out.print(dag.toString());
	}
}