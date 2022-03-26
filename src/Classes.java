
public class Classes {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "(480) 123-4567";
		
		student1.introduce();

		Student student2 = new Student("Sammy", "Jones", "(405) 209-1530", 10);
		
		student2.introduce();

	}

}
