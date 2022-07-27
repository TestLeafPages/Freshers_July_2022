package week2.day3;

import java.util.Arrays;
import java.util.Iterator;

public class LearnArray {
public static void main(String[] args) {
	//using new keyword
	int[] num=new int[5];
	
	//Array litterral
	int[] val= {30,70,20,40,50,60,10};
	int len = val.length;
	System.out.println(len);
	Arrays.sort(val);
//	for (int i = 0; i < val.length; i++) {
//		System.out.println(val[i]);
//	}
	System.out.println(val[7]);
	System.out.println(Arrays.toString(val));
	/*
	 * for (int i = val.length-1; i >=0; i--) { System.out.println(val[i]); }
	 */
	
}
}
