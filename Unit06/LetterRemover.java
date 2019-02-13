//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence, newSentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	public LetterRemover( String s, char rem) 
	{
		sentence = "";
		newSentence = "";
		lookFor = 'a';
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
		newSentence = removeLetters();
	}

	public String removeLetters()
	{
		String cleaned= newSentence;
		for(int i = 0; i< sentence.length(); i++) {
			if(sentence.charAt(i) == lookFor) {
				sentence.replace(lookFor, ' ');
			}
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + newSentence;
	}
}