package week4.day3;

public class Student {

	public void getStudentDetails(int id) {
		System.out.println(id);
	}
public void getStudentDetails(String name) {
		System.out.println(name);
	}
public void getStudentDetails(int id,String name) {
	System.out.println(id+"   "+name);
}
public void getStudentDetails(int id,String name,String address) {
	System.out.println(name+"    "+id);
}
public static void main(String[] args) {
	Student std=new Student();
	std.getStudentDetails(101);
	std.getStudentDetails("Kani");
	std.getStudentDetails(101,"Kani");
	std.getStudentDetails(102);
	std.getStudentDetails("Deva");
	std.getStudentDetails(102,"Deva");
	std.getStudentDetails(103);
	std.getStudentDetails("Devi");
	std.getStudentDetails(103,"Devi");
}
}
