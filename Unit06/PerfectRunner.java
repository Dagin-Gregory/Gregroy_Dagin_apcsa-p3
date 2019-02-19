//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect dag = new Perfect();
		dag.setNums(496);
		dag.checkValues();
		System.out.println(dag.toString());
		dag.setNums(45);
		dag.checkValues();
		System.out.println(dag.toString());
		dag.setNums(6);
		dag.checkValues();
		System.out.println(dag.toString());
		dag.setNums(14);
		dag.checkValues();
		System.out.println(dag.toString());
		dag.setNums(8128);
		dag.checkValues();
		System.out.println(dag.toString());
		dag.setNums(1245);
		dag.checkValues();
		System.out.println(dag.toString());
		dag.setNums(33);
		dag.checkValues();
		System.out.println(dag.toString());
		dag.setNums(28);
		dag.checkValues();
		System.out.println(dag.toString());
		dag.setNums(27);
		dag.checkValues();
		System.out.println(dag.toString());
		dag.setNums(33550336);
		dag.checkValues();
		System.out.println(dag.toString());

	}
}