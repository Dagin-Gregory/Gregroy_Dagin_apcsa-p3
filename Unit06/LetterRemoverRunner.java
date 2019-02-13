//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover dag = new LetterRemover();
		dag.setRemover("I am Sam I am a", 's');
		System.out.println(dag.toString());
	}
}