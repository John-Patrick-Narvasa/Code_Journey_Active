package StudentGrades;

public class MainProgGrades {
	public static void main(String[] args) {
		Student student1 = new Student("Peter", 100);
		double grade = student1.getGrade();
		
		System.out.println("Name: " + student1.getName());
		System.out.println("Grade: " + student1.getGrade());

		
		System.out.println("Letter Grade: " + student1.getLetterGrade(student1.getGrade()));
		
		student1.setGrade(79.00);
	}
}
