package week6.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChildClass  extends ParentClass{

	
	
	public void mul() {
		super.add();
		super.sub();
		System.out.println("mul");
	}
	public void div() {
		System.out.println("div");
	}
	public static void main(String[] args) {
		ChildClass child=new ChildClass();
		ChromeDriver driver=new ChromeDriver();
		child.mul();
		child.div();
	}
}
