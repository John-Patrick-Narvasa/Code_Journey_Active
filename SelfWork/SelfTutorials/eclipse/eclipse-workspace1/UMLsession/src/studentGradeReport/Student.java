package studentGradeReport;

import java.util.List;

public class Student {
	String name;
	List<Double> grades;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void addGrade(double grade) {
		//put into list
	}
	
	public double getHighest() {
		double highest = 0;
		//Initialize list
		//traverse around list
		
		return highest;
	}
	
	public double getLowest() {
		double lowest = 0;
		//Initialize list
		//traverse around list
		
		return lowest;		
	}
	
	public double getAverage() {
		double average = 0;
		//Initialize list
		//traverse around list
		
		return average;
	}
	
	public void printReport() {
		System.out.println(
							"Student Name: " + name + "\n"
							+ "Grades: " + grades + "\n"
							+ "Highest Grade: " + getHighest() + "\n"
							+ "Lowest Grade: " + getLowest() + "\n"
							+ "Average Grade: " + getAverage()
				);
	}
	
}
