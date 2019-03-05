//Dagin Gregory
//P3
//3/4/19

public class labAsses {
	private int goofyNum,sum, tempNum, subNum;
	
	public labAsses() {
		goofyNum = 0;
		sum = 0;
		tempNum = 0;
		subNum = 0;
	}
	
	public labAsses(int num) {
		setNums(num);
	}
	
	public void setNums(int num) {
		sum = 0;
		tempNum = 0;
		subNum = 0;
		goofyNum = num;
	}
	
	public boolean isGoofy() {
		if(goofyNum >= 100) {
			return (getDivisors(goofyNum) % 2 == 1);
			//return getDivisors(goofyNum);
		}
		return false;
		//return 0;
	}
	
	public int getDivisors(int num) {
		if(num >= 100 && num < 110) {
			for(int i = 10; i <= 1000; i *= 100) {
				tempNum = ((num / i) * i);
				subNum = num - tempNum;
				if(subNum / 10 >= 1) {
					while((subNum / 10) >= 1) {
						subNum = subNum / 10;
					}
				}
				if(subNum > 0) {
					if(num % subNum == 0) {
					sum += subNum;
					}
				}
			}
			return sum;
		}
			
		for(int i = 10; i <= 1000; i *= 10) {
			tempNum = ((num / i) * i);
			subNum = num - tempNum;
			if(subNum / 10 >= 1) {
				while((subNum / 10) >= 1) {
					subNum = subNum / 10;
				}
			}
			if(subNum > 0) {
				if(num % subNum == 0) {
				sum += subNum;
				}
			}
		}
		return sum;
	}
	
	public String getSomeGoofyNums(int length) {
		int intToInput = 100;
		String returnString = "";
		for(int x = 0; x<=length; x++) {
			setNums(intToInput);
			if(isGoofy() == true) {
				returnString = returnString + " " + intToInput + ", ";
			}
			intToInput++;
		}
		return "[" + returnString + " ]";
	}
	
	public static void main(String args[]) 
	{
		labAsses test = new labAsses();
		test.setNums(1);
		System.out.println(test.isGoofy());
		System.out.println(test.getSomeGoofyNums(1));
			test.setNums(153);
			System.out.println(test.isGoofy());
			System.out.println(test.getSomeGoofyNums(3));
		test.setNums(2610);
		System.out.println(test.isGoofy());
		System.out.println(test.getSomeGoofyNums(5));
			test.setNums(16384);
			System.out.println(test.isGoofy());
			System.out.println(test.getSomeGoofyNums(10));
		test.setNums(24344);
		System.out.println(test.isGoofy());
		System.out.println(test.getSomeGoofyNums(15));
			test.setNums(777);
			System.out.println(test.isGoofy());
			System.out.println(test.getSomeGoofyNums(20));
	}

}