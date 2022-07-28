package week2.day4;

public class Palindrome {
	public static void main(String[] args) {
		//a) Declare A String value as"madam"
		String value="madama";
		//b) Declare another String rev value as ""
		String rev="";

		char[] charArray = value.toCharArray();
		//c) Iterate over the String in reverse order
		for (int i =charArray.length-1;i>=0 ;i--) {
			//d) Add the char into rev
			rev=rev+charArray[i];
			System.out.println(rev);
		}
		//e) Compare the original String with the reversed String, if it is same then print palinDrome 
		if(value.equals(rev)) {
			System.out.println("given String is Palindrome");
		}else {
			System.out.println("given String is not Palindrome");
		}
	}
}
