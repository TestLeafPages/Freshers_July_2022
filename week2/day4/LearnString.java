package week2.day4;

public class LearnString {
public static void main(String[] args) {
	String text="Good Morning";
	int length = text.length();
	System.out.println(length);
	char[] charArray = text.toCharArray();
	//System.out.println(charArray);
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
	}
}
}
