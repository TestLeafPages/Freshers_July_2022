package week4.day3;

public class BMW  extends Car{

	public void switchOnAC() {
		System.out.println("Switch on Ac");
	}
	public static void main(String[] args) {
		BMW bmw=new BMW();
		bmw.applyBreak();
		bmw.applyGear();
		bmw.switchOnAC();
	}
}
