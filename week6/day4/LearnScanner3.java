package week6.day4;

import java.util.Iterator;
import java.util.Scanner;

public class LearnScanner3 {
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	
	System.out.println("Enter String");
	String nextLine = scan.nextLine();
	System.out.println(nextLine);
//i like chicken biriyani
	String[] split = nextLine.split(" ");
	int length = split.length;
	System.out.println("length"+length);
	int count=0;
	for (int i = 0;i<=split.length-1; i++) {
		System.out.println(split[i]);
		count++;
	}
	System.out.println("count"+count);
}
}
