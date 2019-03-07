import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static List<Integer> makeList(int[] nums) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<nums.length; i++) {
			list.add(nums[i]);
		}
		return list;
	}
	
	public static void main( String args[] )
	{
		ListOddToEven test = new ListOddToEven();
		
		System.out.println(test.go(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11)));
		
			int[] arr2 = {11,9,8,7,6,5,4,3,2,1,-99,7};
			System.out.println(test.go(makeList(arr2)));
		
		int[] arr3 = {10,20,30,40,5,41,31,20,11,7};
		System.out.println(test.go(makeList(arr3)));
		
			int[] arr4 = {32767,70,4,5,6,7};
			System.out.println(test.go(makeList(arr4)));
		
		int[] arr5 = {2,7,11,21,5,7};
		System.out.println(test.go(makeList(arr5)));
		
			int[] arr6 = {7,255,11,255,100,3,2};
			System.out.println(test.go(makeList(arr6)));
		
		int[] arr7 = {9,11,11,11,7,1000,3};
		System.out.println(test.go(makeList(arr7)));
			
			int[] arr8 = {7,7,7,11,2,7,7,11,11,2};
			System.out.println(test.go(makeList(arr8)));
		
		int[] arr9 = {2,4,6,8,8};
		System.out.println(test.go(makeList(arr9)));
		
	}
}