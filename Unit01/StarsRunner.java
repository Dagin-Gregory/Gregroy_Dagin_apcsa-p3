//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.io.Console;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
      StarsAndStripes dagRunner = new StarsAndStripes();
      //call the methods needed to make the patterns on the word document
      out.println("Pattern given to us by word document");
      
      dagRunner.printTwoBlankLines();
      dagRunner.printTwentyDashes();
      dagRunner.printTwentyStars();
      dagRunner.printTwentyDashes();
      dagRunner.printTwentyStars();
      dagRunner.printTwentyDashes();
      dagRunner.printTwentyStars();
      		dagRunner.printASmallBox();
      dagRunner.printTwentyStars();
      dagRunner.printTwentyDashes();
      dagRunner.printTwentyStars();
      dagRunner.printTwentyDashes();
      dagRunner.printTwentyStars();
      dagRunner.printTwentyDashes();
      dagRunner.printTwentyDashes();
      dagRunner.printTwentyStars();
      dagRunner.printTwentyDashes();
      dagRunner.printTwentyStars();
      dagRunner.printTwentyDashes();
      dagRunner.printTwentyStars();
      		dagRunner.printABigBox();
      dagRunner.printTwoBlankLines();	
      
      out.println("Personal Pattern");
      dagRunner.printTwoBlankLines();
	      int x = 3;
	      int y = 5;
	      int z = 7;
      while(x > 0)
      {
    	  dagRunner.printTwentyDashes();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyDashes();
    	  dagRunner.printTwoBlankLines();
    	  x--;
      }
      while(y > 0)
      {
    	  dagRunner.printTwentyDashes();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyDashes();
    	  dagRunner.printTwoBlankLines();
    	  y--;
      }
      while(z > 0)
      {
    	  dagRunner.printTwentyDashes();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyStars();
    	  dagRunner.printTwentyDashes();
    	  dagRunner.printTwoBlankLines();
    	  z--;
      }
   }
}