package week6.day4;

import java.util.Iterator;
import java.util.Scanner;

public class LearnScanner2 {
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	
	System.out.println("Enter String");
	String nextLine = scan.nextLine();
	System.out.println(nextLine);

	char[] charArray = nextLine.toCharArray();
	for (int i = charArray.length-1;i>=0; i--) {
		System.out.println(charArray[i]);
	}
	
}
}
