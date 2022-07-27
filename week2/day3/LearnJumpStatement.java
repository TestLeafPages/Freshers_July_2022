package week2.day3;

public class LearnJumpStatement {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		if(i==3) {
			System.out.println("three");
		//continue;//it wil;l skip thew current iteration
		break;
		}
		System.out.println(i);
	}
}
}
