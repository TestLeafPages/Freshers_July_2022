package week6.day4;

public class Student {
	String studentName;
	int studentId;
	String studentAddress;
	long studentNumber;
	
	 Student(){
	System.out.println("Default constructor");	
	}
	Student(String studentName,int studentId){
		this();
		this.studentName=studentName;
		this.studentId=studentId;
		System.out.println("Parameterized constructor");	
		System.out.println(studentName+"   "+studentId);
		
		}
		
	
public static void main(String[] args) {
	//Student std=new Student();
	Student std2=new Student("Mani",101);
	//Student std2=new Student("Mani",1011,32345454545667l);
//	System.out.println(std.studentName);
//	System.out.println(std.studentId);
//	System.out.println(std.studentAddress);
//	System.out.println(std.studentNumber);
//	
	
}
}
