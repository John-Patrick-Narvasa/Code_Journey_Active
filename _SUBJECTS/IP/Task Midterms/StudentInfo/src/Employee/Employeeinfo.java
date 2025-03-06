package Employee;

public class Employeeinfo {
        public String name;
        public String designation;
        public String academicPosition;
        
        public void display_Employee() {
                System.out.println("EMPLOYEE'S DETAILS");
                System.out.print(
                "Employee Name: " + name + "\n"
                + "Designation: " + designation + "\n"
                + "Academic Position: " + academicPosition + "\n\n"
                );
            }
    }
