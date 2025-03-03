package Main;

import Employee.Employeeinfo;
import Student.Studentinfo;
import Student.Acadinfo;


public class MainProgram {
	public static void main(String[] args) {
		// student 1 
		Studentinfo student1 = new Studentinfo("Jordie Polie", 25, "M", "IRAN", 9320756, "Mr. James Bond", "Mrs. Vice Ganda");
		Employeeinfo employee1 = new Employeeinfo();
		Acadinfo acad1 = new Acadinfo(2468, 90, 90, 100, 95, 100);
		
        // display student 1
		student1.display_student();
		
		employee1.name = "Audrey Lyle";
		employee1.designation = "Faculty";
		employee1.academicPosition = "Professor";
		//display employee 1 
		employee1.display_Employee();

		//display education details.
		acad1.displayEducDetails();
		
		System.out.println("NEXT STUDENT\n");
		
		// student 2
		Studentinfo student2 = new Studentinfo("Hope Elizabeth", 28, "F", "Iraq", 9320756, "Mr. Bong Go ", "Mrs. Gal Gadot");
		Employeeinfo employee2 = new Employeeinfo();
		Acadinfo acad2 = new Acadinfo(13579, 80, 80, 85, 90, 98);
		
        // display student 2
		student2.display_student();
		
		employee2.name = "Bryan Salar";
		employee2.designation = "Faculty";
		employee2.academicPosition = "Professor";
		//display employee 2
		employee2.display_Employee();
		
		//display education details.
		acad2.displayEducDetails();
	}
}