//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number, totalValue, previousNums;

	public Perfect()
	{
		totalValue = 0;
		previousNums = 0;
		number = 0;
	}
	
	public Perfect( int Num ) 
	{
		totalValue = 0;
		previousNums = 0;
		number = Num;
	}
	
	public void setNums( int Num ) 
	{
		number = Num;
	}
	
	public boolean checkValues()
	{
		totalValue = 0;
		previousNums = 0;
		
		for(int i = 1; i < number; i++) {
			if( number % i == 0 ) {
				previousNums += i;
			}
		}
		
		totalValue = previousNums;
		
		if(totalValue == number) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString() {
		if(totalValue == number) {
			return number + " is perfect";
		}
		
		else {
			return number + " is not perfect";
		}
	}
	
}