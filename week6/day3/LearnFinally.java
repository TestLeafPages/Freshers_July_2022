package week6.day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.NoSuchElementException;

public class LearnFinally {
public static void main(String[] args) throws InterruptedException, FileNotFoundException {
	
	int x=10;
	int y=0;
	int z=0;
	
	int[] num= {1,2,3,4}; //indices 0,1,2,3
	
	Thread.sleep(2000);
	File file =new File("./data/create");
	FileInputStream stream=new FileInputStream(file);
	try {
		//z=x/y;
		throw new NoSuchElementException("Exception");
	} 
	finally {
		System.out.println("Finally block");
	}
}
}
