//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word, back;
	private char first, last;
	
	public Word()
	{
		word = "";
		back = "";
		first = ' ';
		last  = ' ';
	}

	public Word(String s)
	{
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		first = word.charAt(0);
		return word.charAt(0);
	}

	public char getLastChar()
	{
		last = word.charAt(word.length()-1);
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		back = "";
		for(int i = word.length()-1; i!=0; i--) {
			back = back + word.charAt(i);
		}
		back += word.charAt(0);
		return back;
	}

 	public String toString()
 	{
 		return first + "\n" + last + "\n" + back + "\n" + word;
	}
}