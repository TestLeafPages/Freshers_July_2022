package week4.day3;

public class Audi extends Car {

	public void openSunRoof() {
		System.out.println("Open Sun roof");
	}
	public static void main(String[] args) {
		Audi audi=new Audi();
		audi.applyBreak();
		audi.applyGear();
		audi.openSunRoof();
	}
}
