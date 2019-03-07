//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public int go(List<Integer> ray)
	{
		int First = ray.indexOf(0);
		int sum = 0;
		for(int i = 0; i<ray.size(); i++) {
			if(First < ray.get(i + 1)) {
				sum += ray.get(i);
			}
		}
		if(sum == 0) {
			return -1;
		}
		return sum;
	}
}