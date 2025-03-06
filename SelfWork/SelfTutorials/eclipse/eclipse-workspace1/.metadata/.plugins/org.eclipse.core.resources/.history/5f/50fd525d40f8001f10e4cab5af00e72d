package EmployeeManagement;

import java.text.DecimalFormat;

public class MainProgEmploy {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###,###.##");
		Employee emp = new Employee("Albert", 178, 50_000);
		
		System.out.print(
						"Name: " + emp.getName() + "\n"
 						+ "ID: " + emp.getId() + "\n"
 						+ "Salary: " + df.format(emp.getSalary())
				);
		
		emp.raiseSalary(100);
	}
}
