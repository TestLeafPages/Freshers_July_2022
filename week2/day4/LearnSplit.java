package week2.day4;

public class LearnSplit {
public static void main(String[] args) {
	String text="I like Chicken Briyani";
	String[] split = text.split(" ");
	int count=0;
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
		count++;
	}
	System.out.println(split.length);
	System.out.println("count"+count);
}
}
