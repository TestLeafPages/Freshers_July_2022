package week2.day3;

public class PrintEachCharacter {
public static void main(String[] args) {
	String text="testleaf";
	char[] charArray = text.toCharArray();
	int count=0;
	for (int i = 0; i < charArray.length; i++) {
		System.out.print(charArray[i]+"  ");
	//count=count+1;
		count++;
	}
	System.out.println();
	System.out.println(charArray.length);
	System.out.println(count);
}
}
