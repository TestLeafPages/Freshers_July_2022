package week6.day3;

import java.util.Arrays;
import java.util.Collections;

import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;

public class LearnStatic {

	static int b =20;
	
	
	
	public static void add() {
		System.out.println("Addition");
	}
	public static void sub() {
		System.out.println("Subraction");
	}
	public static void mul() {
		System.out.println("Multiplication");
	}
	
	public static void main(String[] args) {
		LearnStatic obj=new LearnStatic();
		int a=10;
		int[] num= {1,2,3,4};
		Arrays.sort(num);
		Collections.sort(null);
		Collections.reverse(null);
		b=50;
		System.out.println(b);
		System.out.println(b);
		add();
	}
	
	
}
