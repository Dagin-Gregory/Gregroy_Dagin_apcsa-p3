//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   System.out.println("********************");
   }

   public void printTwentyDashes()
   {
	   System.out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   System.out.println("\n" + "\n");
   }
   
   public void printASmallBox()
   {
	 	printTwentyDashes();
		printTwoBlankLines();
		printTwentyDashes();
   }
 
   public void printABigBox()
   {
	 	printTwentyDashes();
	 	printTwoBlankLines();
	 	printTwoBlankLines();
		printTwentyDashes();
  }
}   