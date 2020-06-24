package twoSum;

public class Solution {
	public static int[] twoSum(int[] numbers, int target) {
		int indx[] = new int[2];
		int stop = 0;
		for(int i=0; i < numbers.length; i++) {
			for (int j=0; j < numbers.length; j++) {
				if ((numbers[i] + numbers[j]) == target) {
					indx[0] = i;
					indx[1] = j;
					stop++;
					break;
				}
			}
			if (stop == 1) {break;}
		}
		return indx;
	}
	
	
	public static void main(String[] args) {
		int[] number = {1,2,3};
		number = twoSum(number,4);
		System.out.println(number[0]);
		System.out.println(number[1]);

	}

}
