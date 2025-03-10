package Main;

import java.util.Scanner;

import Employee.Employeeinfo;
import Student.Studentinfo;
import Student.Acadinfo;

public class MainProgArray {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		
		String[] info = new String[8];
		int[] intInfo = new int[8];
		
		String[] infoInput = {"name", "address", "gender", "Father's Name", "Mother's Name", "Employee's Name", "designation", "position"};
		String[] intInfoInput = {"student's age", "student's contact number", "student no.", "quiz 1 score", "quiz 2 score", "midterm score", "finals score", "attendance"};
		boolean active = true;
		
		System.out.print("Start Program? ");
		String next = input.nextLine();
		while(active) {
			System.out.println("\n");
			
			for (int i = 0; i < info.length; i++) {
				System.out.print("Enter " + infoInput[i] + ": ");
				info[i] = input.nextLine();
			}
			for (int i = 0; i < info.length; i++) {
				System.out.print("Enter " + intInfoInput[i] + ": ");
				intInfo[i] = input.nextInt();
			}
			
			// student
			Studentinfo student1 = new Studentinfo(info[0], intInfo[0], info[2], info[1], intInfo[1], info[3], info[4]);
			Employeeinfo employee1 = new Employeeinfo();
			Acadinfo acad1 = new Acadinfo(intInfo[2], intInfo[3], intInfo[4], intInfo[5], intInfo[6], intInfo[7]);
			
	        // display student
			System.out.println("\n");
			student1.display_student();
			
			employee1.name = info[5];
			employee1.designation = info[6];
			employee1.academicPosition = info[7];
			//display employee
			employee1.display_Employee();

			//display education details.
			acad1.displayEducDetails();
			
			System.out.println("Continue? Y or N: ");
			String continueProg = input.nextLine().toLowerCase();
			
			if (continueProg.equals("y")) {
				System.out.println("NEXT STUDENT\n");
				active = true;
			}
			else if (continueProg.equals("n")) {
				System.out.println("Goodbye :) ");
				active = false;
				input.close();
			}
		}
	}
}
