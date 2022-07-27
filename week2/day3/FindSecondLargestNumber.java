package week2.day3;

import java.util.Arrays;

public class FindSecondLargestNumber {
public static void main(String[] args) {
	int[] num={1,3,4,6,7,8,9,2,0};
	Arrays.sort(num);
	int len=num.length;
	System.out.println(num[len-2]);
	
	
//	for (int i = 0; i < num.length; i++) {
//		System.out.println(num[i]);
//	}
}
}
