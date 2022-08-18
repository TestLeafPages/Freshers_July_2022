package week5.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	
	List<String> name=new ArrayList<String>(); 
	name.add("Anil");
	name.add("Arun");
	name.add("Kavin");
	name.add("Mani");
	
	for (int i = 0; i < name.size(); i++) {
		String string = name.get(i);
		System.out.println(string);
	}
	
	
	System.out.println(name);
	System.out.println(name.size());
	
	name.add(0, "Deva");
	System.out.println(name);
	
	boolean contains = name.contains("Kavitha");
	System.out.println(contains);
	String indexName = name.get(3);
	System.out.println(indexName);
	
	Collections.sort(name);
	
	System.out.println(name);
	
	Collections.reverse(name);
	System.out.println(name);
	
	name.clear();
	
	System.out.println(name);
	
	boolean empty = name.isEmpty();
	System.out.println(empty);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String[] name=new String[5];
//	
//	name[0]="Anu";
//	name[1]="Anil";
	
	//System.out.println(Arrays.toString(name));
}
}
