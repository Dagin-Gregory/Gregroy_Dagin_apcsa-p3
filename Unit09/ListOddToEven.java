//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public int go( List<Integer> ray )
	{
		int oddFirst = 0;
		int evenFirst = 0;
		int distance = 0;
		for(int i = 0; i<ray.size(); i++) {
			if(ray.get(i) % 2 == 1 && oddFirst == 0) {
				oddFirst = i + 1;
			}
			if(ray.get(i) % 2 == 0) {
				evenFirst = i;
			}
		}
		if(oddFirst > 0 && oddFirst < evenFirst) {
		distance  = Math.abs(oddFirst - evenFirst);
			if(distance > 0) {
			return distance + 1;
			}
		}
		return -1;
	}
	
}