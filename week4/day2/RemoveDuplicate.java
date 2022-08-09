package week4.day2;

public class RemoveDuplicate {
public static void main(String[] args) {
	//Use the declared String text as input
	String text = "We learn java basics as java part of Java sessions in java week1";
	String[] split = text.split(" ");
	//Initialize an integer variable as count
	int count=0;
	for (int i = 0; i < split.length; i++) {
		//d) Initialize another loop to check whether the word is there in the array
		for (int j = i+1; j < split.length; j++) {
			if (split[i].equalsIgnoreCase(split[j])) {
				//f) if the count > 1 then replace the word as "" 
				split[j] = "";
				//e) if it is available then increase and count by 1. 
				count++;
	        	}
			}
	}
	// g) Displaying the String without duplicate words	
	System.out.println("String without duplicates: ");
	if(count>=1) {
	for (int k = 0; k < split.length; k++) {
		System.out.print(split[k] + " ");
	}

}
}
}

