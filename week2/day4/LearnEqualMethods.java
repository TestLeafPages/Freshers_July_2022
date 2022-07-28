package week2.day4;

public class LearnEqualMethods {
public static void main(String[] args) {
	String text="TestLeaf";
	String text2="TestLeaf";
	if(text==text2) {
		System.out.println("litteral "+"both are equal");
	}else {
		System.out.println("litteral"+"both are not equal");
	}
	boolean equals = text.equals(text2);
	System.out.println(equals);
	
	boolean equalsIgnoreCase = text.equalsIgnoreCase(text2);
	System.out.println("equalsIgnoreCase"+equalsIgnoreCase);
	
	
	String name1=new String("Kannan");
	String name2=new String("Kannan");
	if(name1==name2) {
		System.out.println("both are equal");
	}else {
		System.out.println("both are not equal");
	}
	
	
	boolean equals2 = name1.equals(name2);
	System.out.println(equals2);
}
}
