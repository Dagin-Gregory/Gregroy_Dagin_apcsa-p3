//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
{
	 String vowels = "aeiouAEIOU";
	 if( vowels.indexOf(a.charAt(0)) > - 1) {
		 return "yes";
	 }
	 if( vowels.indexOf(a.charAt(0)) == a.length()) {
		 return "yes";
	 }
	 return "no";
}
}