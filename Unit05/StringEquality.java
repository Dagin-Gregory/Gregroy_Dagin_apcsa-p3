//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
	}

	public StringEquality(String one, String two)
	{
		wordOne = "";
		wordTwo = "";
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		setWords(wordOne, wordTwo);
		if(wordOne.equals(wordTwo) && wordOne.compareTo(wordTwo) == 0) {
			return true;
		}
		return false;
	}

	public String toString()
	{
		if(checkEquality() == true) {
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		else {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
	}
}