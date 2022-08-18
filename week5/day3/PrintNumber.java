package week5.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintNumber {
public static void main(String[] args) {
	Set<Character> obj=new LinkedHashSet<Character>();
	
	obj.add('A');
	obj.add('b');
	obj.add('z');
	obj.add('d');
	obj.add('B');
	obj.add('C');
	obj.add('Z');
	
	System.out.println(obj);
	
}
}
