//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int l = ray.length;
		int num = ray[l-1];
		int sum = 0;
		for (int i = 0; i < l; i++) {
			if (ray[i] > num) {
				sum += ray[i];
			}
			else {
			}
		}
		if (sum > 0) {
			return sum;
		}
		else {
			return -1;
		}
	}
}