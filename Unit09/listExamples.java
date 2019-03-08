//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListDown
{
	public boolean go(List<Integer> numArray)
	{
		if(numArray.size() < 2 ) {
			return false;
		}
		
		int i = 0;
		int prev = 0;
		
		for(int x = 1; x<numArray.size(); x++) {
			i = numArray.get(x);
			if(prev <= i)
			{
				return false;
			}
			prev = i;
		}

		return true;
	}
	
	public boolean go2(List<Integer> numArray)
	{
		if(numArray.size() < 2 ) {
			return false;
		}
		
		int prev = 0;
		for(int i : numArray) {
			if( prev <= i ) {
				return false;
			}
			prev = i;
		}
		return true;
	}
	public boolean go4(List<Integer> numArray) {
		return go3(numArray.iterator());
	}
	
	public boolean go3(Iterator<Integer> iter)
	{
		if(!iter.hasNext()) {
			return false;
		}
		int prev = 0;
		int curr = iter.next();
		if(!iter.hasNext()) {
			return false;
		}
		
		while(iter.hasNext()) {
			prev = curr;
			curr = iter.next();
			if( prev <=  curr) {
				return false;
			}
		}
		return true;
	}
}