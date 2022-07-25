package week1.day4;

public class LearnVariables {
	String text="TestLeaf";
	int c;
	
	public void add() {
		int e=10;
		int f=20;
		c=e+f;
		System.out.println("addition"+c);
	}
	
	
public static void main(String[] args) {
	LearnVariables variables=new LearnVariables();
	variables.add();
	String text2 = variables.text;
	System.out.println(text2);
	System.out.println("C "+variables.c);
	int a = 0;
	int b=20;
	System.out.println(a);
	System.out.println(b);
}
}
