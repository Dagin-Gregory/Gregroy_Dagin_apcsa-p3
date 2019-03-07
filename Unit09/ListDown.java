//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	public boolean go(List<Integer> numArray)
	{
		int count = 0;
		int[] newArray = new int[numArray.size()];
		for(int i = 0; i<numArray.size(); i++) {
			newArray[i] = numArray.get(i);
		}
		for(int x = 0; x<newArray.length - 1; x++) {
			if(newArray[x] > newArray[x + 1])
			{
				count++;
			}
		}
		if(count + 1 == numArray.size()) {
			return true;
		}
		return false;
	}
}