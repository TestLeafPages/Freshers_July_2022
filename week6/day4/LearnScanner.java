package week6.day4;

import java.util.Scanner;

public class LearnScanner {
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	
	System.out.println("Enter your name");
	String nextLine = scan.nextLine();
	
	System.out.println(nextLine);
	
	System.out.println("enter age");
	int nextInt = scan.nextInt();
	System.out.println(nextInt);
	
	
}
}
