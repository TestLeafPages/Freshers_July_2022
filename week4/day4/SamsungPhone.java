package week4.day4;

import oops.AndroidDesign;

public class SamsungPhone implements AndroidDesign,SamsungDesign {

	@Override
	public void makeCall() {
		System.out.println("Make call");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("Send Sms");
		
	}

	@Override
	public void shareDocument() {
		System.out.println("Share Document");
		
	}
	public void samsungNote() {
		System.out.println("Samsung  Note");
	}

	@Override
	public void faceAuthendication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voiceRegconition() {
		// TODO Auto-generated method stub
		
	}

}
