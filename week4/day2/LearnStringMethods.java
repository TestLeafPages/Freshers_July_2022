package week4.day2;

import java.util.Iterator;

public class LearnStringMethods {
public static void main(String[] args) {
	String text1="TestLeaf";
	
	String lowerCase = text1.toLowerCase();
	System.out.println(lowerCase);
	
	String upperCase = text1.toUpperCase();
	System.out.println(upperCase);
	
	String S1="    hellow world    ";
	
	String trim = S1.trim();
	System.out.println(trim);
	
	
	String t1="Test";
	String t2="Leaf";
	String t3= t1+t2;
	System.out.println(t3);
	
	
	String s4="dinesh";
	String s5="rahul";
	System.out.println(s4);
	System.out.println(s5);
	
	String obj=new String("Value");
	String obj1=new String("Value");
	String obj2=new String("Value");
	String obj3=new String("Value");
	String obj4=new String("Value");
	
	String concat = t1.concat("Chennai");
	System.out.println(concat);
	
	
	String name="All is well";
	String replace = name.replace('l', '@');
	System.out.println(replace);
	
	String text2="Testleaf1234is12";
	String replaceAll = text2.replaceAll("\\D", "");
	System.out.println(replaceAll);
	
	String data="Testleaf";
	String substring = data.substring(4);
	System.out.println(substring);
	
	
	CharSequence subSequence = data.subSequence(3, 6);
	System.out.println(subSequence);
	
	String data1="testleaf";
	String data2="TestLeaf";
	boolean equalsIgnoreCase = data1.equalsIgnoreCase(data2);
	System.out.println(equalsIgnoreCase);
	boolean equals = data1.equals(data2);
	System.out.println(equals);
	
	
	String name3="Testleaf in chennai";
	boolean contains = name3.contains("chennai");
	System.out.println(contains);
	
	
	String dataLength="Test";
	int indexOf = dataLength.indexOf('s');
	System.out.println(indexOf);
	
	boolean empty = dataLength.isEmpty();
	System.out.println(empty);
	
	
	String word="i like india";
	String[] split = word.split(" ");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
}
}
