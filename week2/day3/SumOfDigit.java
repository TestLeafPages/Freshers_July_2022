package week2.day3;

public class SumOfDigit {
public static void main(String[] args) {
	int num=12345;
	int sum=0;
	while (num>0) {
	int remainder=num%10;
	sum=sum+remainder;
	System.out.println(sum);
	num=num/10;
	
}
}
}
