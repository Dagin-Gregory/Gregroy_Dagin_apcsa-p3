//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddIndex = 0;
		int evenIndex = 0;
		for(int i = 0; i<ray.length; i++) {
			if(ray[0] % 2 == 0) {
				evenIndex = 0;
			}
			if(ray[0] % 2 == 1) {
				oddIndex = 0;
			}
			if(ray[i] % 2 == 1 && oddIndex == 0) {
				oddIndex = i;
			}
			if(ray[i] % 2 == 0 && evenIndex == 0) {
				evenIndex = i;
			}
		}
		return evenIndex;
	}
}