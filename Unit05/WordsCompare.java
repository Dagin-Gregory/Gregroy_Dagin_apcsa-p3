//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
	}

	public WordsCompare(String one, String two)
	{
		wordOne = "";
		wordTwo = "";
		compare = 0;
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void compare()
	{
		setWords(wordOne, wordTwo);
		int c1 = wordOne.compareTo(wordTwo);
		int c2 = wordTwo.compareTo(wordOne);
		if( c1 > 0 && wordOne.equalsIgnoreCase(wordTwo)) {
			compare = c1;
		}
		else {
			compare = c2;
		}
	}

	public String toString()
	{
		if(compare >0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}