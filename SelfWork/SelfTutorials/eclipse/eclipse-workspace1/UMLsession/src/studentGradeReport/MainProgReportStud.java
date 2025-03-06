package studentGradeReport;

public class MainProgReportStud {
	public static void main(String[] args) {
		Student student = new Student("Tom Jones");
		
		student.addGrade(97);
		student.addGrade(94);
		student.addGrade(90);
		
		student.printReport();
		
		
	}
}
