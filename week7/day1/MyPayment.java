package week7.day1;

public class MyPayment {

	public static void main(String[] args) {
		Payment pay=new Payment();
		pay.setCreditCardNumber("5555 5555 5555 5555");
		System.out.println(pay.getCreditCardNumber());
	}
}
