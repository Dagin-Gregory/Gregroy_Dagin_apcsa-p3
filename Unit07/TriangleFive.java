//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = 'a';
		amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
		setVars(c, amt);
	}

	public void setVars(char c, int amt)
	{
		letter = c;
		amount = amt;
	}
	
	public String fullOutput()
	{
		int adder = 0;
		for(int i = amount; i>0; i--) {
			for(int x = amount; x>0; x--) {
				System.out.print( (char) (letter + adder));
				for(int y = x; y>1; y--) {
					System.out.print( (char) (letter + adder));
				}
				adder++;
			}
			amount--;
			System.out.print("\n");
		}
		return "";
	}

	public String toString()
	{
		String output="";
		return output;
	}
}