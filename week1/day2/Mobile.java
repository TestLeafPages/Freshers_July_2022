package week1.day2;

public class Mobile {
	
	public void makeCall() {
			System.out.println("make call");
	}

	public void sendText() {
		System.out.println("send text");
	}
public void browsingData() {
		System.out.println("browse website");
	}

public static void main(String[] args) {
	Mobile mob=new Mobile();
	mob.makeCall();
	mob.browsingData();
	mob.sendText();
}




}
