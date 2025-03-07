package StudentGrades;

public class Student {
	private String name;
	private double grade;
	
	public Student(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	public double getGrade() {
		return grade;
	}
	
	
	public void setGrade(double grade) {
		System.out.println("Updated Grade: " + grade);
		System.out.println("Letter Grade: " + getLetterGrade(grade));
	}
	
	public String getLetterGrade(double grade) {
		if (grade >= 90) {
			return "A";
		}
		else if (grade >= 80) {
			return "B";
		}
		else if (grade >= 70) {
			return "C";
		}
		else if ( grade >= 60) {
			return "D";
		}
		else {
			return "F";
		}
	}
	
}
