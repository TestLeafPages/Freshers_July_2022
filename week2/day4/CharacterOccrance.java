package week2.day4;

public class CharacterOccrance {
	public static void main(String[] args) {
		String str = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences
		int count=0;
		// convert the string into char array
		char[] charArray = str.toCharArray();
		//get the length of the array
		int length = charArray.length;
		// traverse from 0 till the array length 
		for (int i = 0; i < charArray.length; i++) {
			// Check the char array has the particular char in it 
			if(charArray[i]=='e') {
				// if is has increment the count
				count=count+1;
			}
		}
		// print the count out of the loop
		System.out.println("e  "+count);




	}
}
