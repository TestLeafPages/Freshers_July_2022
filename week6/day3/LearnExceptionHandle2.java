package week6.day3;

import org.openqa.selenium.NoSuchElementException;

public class LearnExceptionHandle2 {
public static void main(String[] args) {
	
	int x=10;
	int y=0;
	int z=0;
	
	int[] num= {1,2,3,4}; //indices 0,1,2,3
	
	
	try {
		z=x/y;
		
	} catch (ArithmeticException e) {
		System.out.println(e);	}
	
	try {
		System.out.println(num[4]);
	} catch (Exception e) {
	System.out.println(e);
	}
	
	
	System.out.println("End of the Program");
}
}
