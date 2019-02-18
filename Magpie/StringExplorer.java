/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		Magpie3 dag = new Magpie3();
		String sample = "The quick brown fox jumped over the lazy dog.";
		String str = "Computer science is the best, the greatest, and most wonderful subject to study!";
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		int pos = sample.indexOf("slow");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		if(pos != -1) {
		System.out.println("slow is found at position " + pos);
		}
		else {
		System.out.println("slow is not found");
		}
		//  Try other methods here
		System.out.println(dag.findKeyword(str, "the", 0));
	}
}
