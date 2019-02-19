//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne dag = new TriangleOne();
		dag.setWord("hippo");
		dag.print();
		dag.setWord("abcd");
		dag.print();
		dag.setWord("it");
		dag.print();
		dag.setWord("a");
		dag.print();
		dag.setWord("chicken");
		dag.print();
	}
}