//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	
	private double distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		
	}

	public void calcMPH()
	{
		double time =  (hours + minutes/60);
		mph = ( distance / time );
	}

	public void print()
	{
		out.println(mph);
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}