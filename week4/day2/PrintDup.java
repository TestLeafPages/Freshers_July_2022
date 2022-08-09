package week4.day2;

public class PrintDup {
public static void main(String[] args) {
	int[] num= {1,2,3,4,5,6,7,8,4,3,2};
	
	//2,3,4
	
	for (int i = 0; i < num.length; i++) {
		for (int j = i+1; j < num.length; j++) {
			if(num[i]==num[j]) {
				System.out.println(num[i]);
			}
		}
	}
}
}
