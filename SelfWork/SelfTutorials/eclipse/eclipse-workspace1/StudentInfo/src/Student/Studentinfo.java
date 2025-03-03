package Student;

public class Studentinfo{
        String name;
        int age;
        char gender;
        String address;
        int contactNumber;
        String fatherName;
        String motherName;
        
        public Studentinfo(String name, int age, char gender, String address, int contactNumber, String fatherName, String motherName) {
                this.name = name;
                this.age = age;
                this.gender = gender;
                this.address = address;
                this.contactNumber = contactNumber;
                this.fatherName = fatherName;
                this.motherName = motherName;  
        }
            
        public void display_student() {
                System.out.println("STUDENT DETAILS");
                System.out.print(
                "Student Name: " + name + "\n"
                + "Age: " + age +"\n"
                + "Student Gender: " + gender + "\n"
                + "Student Address: " + address + "\n"
                + "Contact Number: " + contactNumber + "\n"
                + "Father's name: " + fatherName + "\n"
                + "Mother's name: " + motherName +"\n\n");
            }
    }
