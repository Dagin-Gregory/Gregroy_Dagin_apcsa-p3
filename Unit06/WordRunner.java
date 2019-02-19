//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word dag = new Word();
		dag.setString("Hello");
		dag.getFirstChar();	
		dag.getLastChar();
		dag.getBackWards();
		System.out.println(dag.toString());
		dag.setString("World");
		dag.getFirstChar();	
		dag.getLastChar();
		dag.getBackWards();
		System.out.println(dag.toString());
		dag.setString("JukeBox");
		dag.getFirstChar();	
		dag.getLastChar();
		dag.getBackWards();
		System.out.println(dag.toString());
		dag.setString("TCEA");
		dag.getFirstChar();	
		dag.getLastChar();
		dag.getBackWards();
		System.out.println(dag.toString());
		dag.setString("UIL");
		dag.getFirstChar();	
		dag.getLastChar();
		dag.getBackWards();
		System.out.println(dag.toString());
	}
}