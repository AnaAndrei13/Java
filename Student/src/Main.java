import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(8.5,"Alina"));
        students.add(new Student(7.5, "Tudor"));
        students.add(new Student(9.0,"Mihaela"));
        students.add(new Student(8.0,"Elena"));

        ArrayList<Student> sortedStudents = new ArrayList<>();


        while (!students.isEmpty()) {
            Student maxStudent = students.get(0);
            for (Student iterator : students) {
                if (iterator.getGrade() > maxStudent.getGrade()) {
                    maxStudent = iterator;
                }
            }
            sortedStudents.add(maxStudent);
            students.remove(maxStudent);
        }

        System.out.println("List of students sorted by grade: ");
        for (Student iterator : sortedStudents) {
            System.out.println(iterator.getGrade() + ": " + iterator.getName());
        }
    }
}



