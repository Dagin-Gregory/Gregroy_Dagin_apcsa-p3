//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		for(int i = 0; number > 0; i++) {
			number /= 10;
			count = i;
		}
		return count + 1;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
			for(int i = 0; i<sorted.length; i++) {
				sorted[i] = number%10;
				number /= 10;
			}
			for(int  y = 0; y<sorted.length; y++) {
				int min = sorted[y];
				for(int  n = y+1; n<sorted.length; n++) {
					if(sorted[n]<min) {
						int temp = sorted[n];
						min = temp;
						sorted[n] = sorted[y];
						sorted[y] = temp;
					}
				}
			}
		return sorted;
	}
}