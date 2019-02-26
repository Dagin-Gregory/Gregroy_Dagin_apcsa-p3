//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int side1,side2,side3,inputNum;

	public Triples()
	{
		side1 = 0;
		side2 = 0;
		side3 = 0;
		inputNum = 0;
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		inputNum = num;
	}
	
	public int greatestCommonFactor()
	{
		int max = inputNum;
		for (side1 = 1; side1 <= max; side1++)
		{
			 for (side2 = 1; side2 <= max; side2++)
			 {
			 
			 for (side3 = 1; side3 <= max; side3++)
			 {
			 if ((side1*side1)+(side2*side2)==(side3*side3)) {
			 System.out.println("s1: " + side1 + " " + "s2: " + side2 + " " + "s3: " +
			side3);
			 }
		}
	}
	
	}
		return 1;
	}

	public String toString()
	{
		String output="";






		return output+"\n";
	}
}