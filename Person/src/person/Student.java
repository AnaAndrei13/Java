package person;

import java.util.List;

public class Student extends Person {
    private int academic_year;


    public Student(String name, String CNP, Address address, int academic_year) {
        super(name, CNP, address);
        this.academic_year = academic_year;

    }


    public void changeStudentAddress(Student student, Address newAddress) {
        if (student != null) {
            student.setAddress(newAddress);
            System.out.println("Student's address has been updated.");
        } else {
            System.out.println("No student associated with this course.");
        }


    }


}