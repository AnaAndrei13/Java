
import person.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create address
        Address courseAddress = new Address("Main Street","12","CityA");
        Address teacherAddress = new Address("B210 Street","12","CityA");
        Address studentAddress1 = new Address("Student Street 1", "13","CityA");
        Address studentAddress2 = new Address("Student Street 2", "14"," CityB");
        Address studentAddress3 = new Address("Student Street 76", "133","CityA");
        Address studentAddress4 = new Address("Student Street 6", "104"," CityB");
        // Create teacher
        Teacher teacher = new Teacher("John Doe", "23134555544", teacherAddress,"Algebra","Math");
        System.out.println("Teacher:");
        System.out.println(teacher);
        List<Student> students = new ArrayList<>();

        // Create students
        Student student1 = new Student("Alice", "436789", studentAddress1, 1);
        Student student2 = new Student("Bob", "6771239", studentAddress2, 1);
        Student student3 = new Student("Marta", "436700", studentAddress3, 1);
        Student student4 = new Student("Elena", "6773499", studentAddress4, 1);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        // Create course
        Course course = new Course("Math", teacher, students,courseAddress);

        // Add students to course
        course.addStudentToCourse(student1);
        course.addStudentToCourse(student2);
        course.addStudentToCourse(student3);
        course.addStudentToCourse(student4);

        // Add teacher at course
        course.setTeacher(teacher);

        // Remove student from course
        course.removeStudentFromCourse(student1);

        // Remove teacher from course
        course.removeTeacherFromCourse();

        // Change teacher's address
        Address newTeacherAddress = new Address("New 12 Street", "54","New Teacher City");
        teacher.changeTeacherAddress(teacher,newTeacherAddress);

        // Change student's address
        Address newStudentAddress = new Address("New Student Street", "13","New Student City");
        student2.changeStudentAddress(student2, newStudentAddress);



        System.out.println("Teacher:");
        System.out.println(teacher);

        // Display info about course
        System.out.println("\nCourse:");
        System.out.println(course);

        // Display info about students
        System.out.println("\nStudents:");
        for (Student student : course.getStudents()) {
            System.out.println(student);
        }


    }



}
