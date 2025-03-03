package Student;

import java.text.DecimalFormat;

public class Acadinfo {
        DecimalFormat df = new DecimalFormat("###.00");
        int studentNumber;
        double quiz1;
        double quiz2;
        double midterm;
        double finals;
        double gradeAverage;
        int attendance;
        
        public Acadinfo(int studentNumber, double quiz1, double quiz2, double midterm, double finals, int attendance) {
                this.studentNumber = studentNumber;
                this.gradeAverage = gradeAverage;
                    this.quiz1 = quiz1;
                    this.quiz2 = quiz2;
                    this.midterm = midterm;
                    this.finals = finals;
                this.attendance = attendance;
            }
            
        public void displayEducDetails() {
                 gradeAverage = (quiz1 + quiz2 + midterm + finals) / 4;
                System.out.println("STUDENT EDUCATIONAL DETAILS");
                System.out.print(
                "Student Number: " + studentNumber + "\n"
                + "Student Grade Average: " + df.format(gradeAverage) + "\n"
                + "Student Attendance: " + attendance + "%" + "\n\n\n");
            }
    }
