package week2.day1;

public class StudendDetails {

	public void printStudentName(String name) {
		
		System.out.println(name);
	}
	public void printStudentId(int id) {
		
		System.out.println(id);
	}
	public void printStudentAddress(String address) {
		
		System.out.println(address);
	}
	public static void main(String[] args) {
		StudendDetails std=new StudendDetails();
		std.printStudentName("Deva");
		std.printStudentId(101);
		std.printStudentAddress("Chennai");
		std.printStudentName("Kannan");
		std.printStudentId(102);
		std.printStudentAddress("Madurai");
		std.printStudentName("Arun");
		std.printStudentId(103);
		std.printStudentAddress("Covai");
	}
}
