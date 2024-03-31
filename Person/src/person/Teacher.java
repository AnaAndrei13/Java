package person;

import java.util.List;

public class Teacher  extends Person{
    final String specialisation;
    final String course;

    public Teacher(String name, String CNP, Address address, String specialisation, String course) {
        super(name, CNP, address);
        this.specialisation = specialisation;
        this.course =course ;

    }



    public void changeTeacherAddress(Teacher teacher,Address new_address ) {
        if (teacher != null) {
            teacher.setAddress(new_address);
            System.out.println("Teacher's address has been updated.");
        } else {
            System.out.println("No teacher associated with this course.");
        }
    }
}
