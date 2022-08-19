package week5.day5;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicate {
public static void main(String[] args) {
	int[] data = {4,3,6,8,29,1,2,4,7,8};
	 // Problem Statement : Print only duplicate values
	 //Expected output: 4 and 8
	 
	 //How to solve?
	 // 1) Regular for loop
	// 2) Using Set
	 Set<Integer> printDuplicate=new TreeSet<Integer>();
	 // Using Set 
	 
	 //a) Add every element into Set
	 
	 for (int i = 0; i < data.length; i++) {
		//b) If it is already there in the Set -> Print duplicate
		 if(!printDuplicate.add(data[i])) {
			 System.out.println(data[i]);
		 }
		// printDuplicate.add(data[i]);
	}
	 
	 
	 
	// System.out.println(printDuplicate);
}
}
