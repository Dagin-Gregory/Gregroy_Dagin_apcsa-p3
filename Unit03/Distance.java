//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance,val;

	public Distance()
	{
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		val = 0;
		xOne = 0;
		xTwo = 0;
		yOne = 0;
		yTwo = 0;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}

	public void calcDistance()
	{
		val = Math.sqrt((yTwo-yOne)*(yTwo-yOne)+(xTwo-xOne)*(xTwo-xOne));
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
		out.println(val);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}