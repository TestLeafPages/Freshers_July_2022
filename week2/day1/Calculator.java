package week2.day1;

public class Calculator {
	public int add(int a,int b) {
		
		int c=a+b;
		return c;
	}
	public void sub(int add,int b) {
		
		int c=add-b;
		System.out.println(c);
	}
public static void main(String[] args) {
	Calculator calc=new Calculator();
	int add = calc.add(50,50);
	System.out.println(add);
	calc.sub(add,20);
}
}
