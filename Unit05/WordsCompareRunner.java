//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare dag = new WordsCompare();
	   
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("Enter a string for string one:: ");
	   String one = keyboard.next();
	   System.out.println("Enter a string for string two:: ");
	   String two = keyboard.next();
	   dag.setWords(one, two);
	   dag.compare();
	   System.out.println(dag.toString());
   }
}