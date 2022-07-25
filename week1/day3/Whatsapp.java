package week1.day3;

public class Whatsapp {

	public void makeWhatsappCall() {
		System.out.println("Whatsapp call");
	}
	protected void makeWhatsappVideoCall() {
		System.out.println("Whatsapp call");
	}
	
	private void whatsappPayment() {
		System.out.println("paymment");
	}
	
	void sendText() {
		System.out.println("send Text");
	}
	public static void main(String[] args) {
		Whatsapp app=new Whatsapp();
		app.makeWhatsappCall();
		app.makeWhatsappVideoCall();
		app.whatsappPayment();
		app.sendText();
		
		
		
		
		
		
				
	}
}
