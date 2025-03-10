package EmployeeManagement;
import java.text.DecimalFormat;

public class Employee {
	DecimalFormat df = new DecimalFormat("###,###,###.##");
	
	private String name;
	private int id;
	private double salary;
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	
	public void  raiseSalary(double percentage) {
		salary = salary + (salary * (percentage / 100));
		System.out.println("\nRaised Salary: "+ df.format(salary));
	}
	
}
