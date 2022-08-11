package week4.day3;

public class IndianBank extends Bank {

	public void deposit() {
		System.out.println("Indian bank Deposit");
	}
	public static void main(String[] args) {
		IndianBank bank=new IndianBank();
		bank.saving();
		bank.deposit();
	}
}
