package week6.day3;

import org.openqa.selenium.NoSuchElementException;

public class LearnExceptionHandle {
public static void main(String[] args) {
	
	int x=10;
	int y=5;
	int z=0;
	
	int[] num= {1,2,3,4}; //indices 0,1,2,3
	
	
	try {
		z=x/y;
		System.out.println(z);
		try {
			System.out.println(num[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	catch (NoSuchElementException e) {
		System.out.println(e);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	System.out.println("End of the Program");
}
}
