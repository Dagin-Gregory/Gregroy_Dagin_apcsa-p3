//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
	public static String go( String a ) {
		{
			 if(findVowelForward(a)
				|| findVowelReverse(a)) {
				 return "yes";
			 }
			 else {
				 return "no";
			 }
		}
	}
	static String vowels = "AEIOU";
	
	public static char findNotHashForward( String a) {
		return (findNotHash(a, 0, 1));
	}
	
	public static char findNotHashReverse( String a) {
		return (findNotHash(a, a.length()-1, -1));
	}
	
	public static boolean findVowelForward(String a)
	{
		return isVowel(findNotHashForward(a));
	}
	
	public static boolean findVowelReverse(String a)
	{
		return isVowel(findNotHashReverse(a));
	}
	
	public static char findNotHash( String a, int index, int increment )
	   {
		   for(; index >= 0 && index < a.length(); index = index + increment ) {
			   char c = a.charAt(index);
			   if(c != '#') {
				   return c;
			   }
		   }
		return 0;
	   }
	
	public static boolean isVowel( char c) {
		c = Character.toUpperCase(c);
		   for(int index = 0; index < vowels.length(); index++) {
			   if(vowels.charAt(index) == c) {
				   return true;
			   }
		   }
		   return false;   
	  }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	static String vowels = "aeiouAEIOU";
	   
	public static String go( String a )
	{
		 if(findVowelForward(a)
			|| findVowelReverse(a)) {
			 return "yes";
		 }
		 else {
			 return "no";
		 }
	}
	
	public static boolean findVowelForward(String a)
	{
		return isVowel(findNotHashForward(a));
	}
	
	public static boolean findVowelReverse(String a)
	{
		return isVowel(findNotHashReverse(a));
	}
	
	public static char findNotHashForward(String a)
	{
		return findNotHash( a, 0, 1);
	}
	
	public static char findNotHashReverse(String a)
	{
		return findNotHash( a, a.length() - 1, -1);
	}
   
   public static char findNotHash( String a, int index, int increment )
   {
	   for(; index >= 0 && index < a.length(); index = index + increment ) {
		   char c = a.charAt(index);
		   if(c != '#') {
			   return c;
		   }
	   }
	   return 0;
   }
   
   public static boolean isVowel( char c ) {
	   for(int index = 0; index < vowels.length(); index++) {
		   if(vowels.charAt(index) == c) {
			   return true;
		   }
	   }
	   return false;
   }
   */