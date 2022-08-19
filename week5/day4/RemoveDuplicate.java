package week5.day5;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
public static void main(String[] args) {
	//a) Use the declared String text as input
String text = "We learn java basics as part of java sessions in java week1";

//Output= We learn java basics as part of sessions in week1

//Psuedocode

//b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  

String[] split = text.split(" ");

// c) Create a empty Set 

Set<String> removeDuplicate=new LinkedHashSet<String>();
// d) Iterate the String array
for (int i = 0; i < split.length; i++) {
	// d.1) add each word into Set
	removeDuplicate.add(split[i]);
	
}
System.out.println(removeDuplicate);
        
//e) Print the Set values which is having unique words
}
}
