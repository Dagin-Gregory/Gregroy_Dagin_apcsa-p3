//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four, biggestDouble;
	private double[] nums = new double[] {};
	 
	public BiggestDouble()
	{
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		one = 0;
		two = 0;
		three = 0;
		four = 0;
		biggestDouble = 0;
		nums = new double[] {4};
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
		biggestDouble = 0;
		nums = new double[] {one, two, three, four};
	}

	public double getBiggest()
	{
		biggestDouble = nums[0];
		for(int i = 0; i<nums.length - 1; i++) {
			if(biggestDouble < nums[i + 1]) {
				biggestDouble = nums[i + 1];
			}
		}
		return biggestDouble;
	}

	public String toString()
	{
	   return "";
	}
}