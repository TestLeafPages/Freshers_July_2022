package week4.day4;

import java.util.ArrayList;
import java.util.List;

import oops.AndroidDesign;

public class MyPhone {
public static void main(String[] args) {
	SamsungPhone phone=new SamsungPhone();
	phone.sendSMS();
	phone.shareDocument();
	phone.samsungNote();
	phone.sendSMS();
	phone.voiceRegconition();
	phone.faceAuthendication();
	
	AndroidDesign design=new SamsungPhone();
	design.makeCall();
	design.sendSMS();
	design.shareDocument();
//	design.samsungNote();
	//List<String> obj=new ArrayList<String>();
	
	
	SamsungDesign design2=new SamsungPhone();
	design2.voiceRegconition();
	design2.faceAuthendication();
	//design2.samsungNote();
}
}
