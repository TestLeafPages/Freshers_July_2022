package week5.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	//Set<String> name=new HashSet<String>();
	//Set<String> name=new LinkedHashSet<String>();
	Set<String> name=new TreeSet<String>();
	
	boolean add1 = name.add("Arun");
	System.out.println(add1);
	name.add("Kannan");
	name.add("Tamil");
	name.add("Devi");
	name.add("Balu");
	boolean add2 = name.add("Arun");
	System.out.println(add2);
	
	System.out.println(name);
	
}
}
