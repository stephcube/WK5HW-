
public class Student {
	
	static int numberOfStudents;
	
	String firstName;
	String lastName;
	String phoneNumber;
	int gradeLevel;
	
	public Student() {}
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneNumber = phoneNumber;
	this.gradeLevel = gradeLevel;
	
	}
	
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);		
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
		
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getlastName() {
		return lastName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber () {
		return phoneNumber;
	}
	
	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;	
	}
	
	public int getGradeLevel () {
		return gradeLevel;
	}
	
}
