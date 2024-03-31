package person;

import java.util.ArrayList;
import java.util.List;

public class Course {
    final String nameCourse;
    private Teacher teacher;
    private Address address;
    final List<Student> students;



    public Course(String nameCourse, Teacher teacher,List<Student> students, Address address) {
        this.nameCourse = nameCourse;
        this.teacher = teacher;
        this.students = new ArrayList<>();
        this.address=address;
    }
    public void setTeacher(Teacher teacher){
        this.teacher=teacher;
    }
    public void addStudentToCourse(Student student) {
        students.add(student);
    }

    public void removeStudentFromCourse(Student student) {
        students.remove(student);
    }

    public void addTeacherToCourse(Teacher teacher) {
       this.teacher= teacher;
    }

    public void removeTeacherFromCourse() {
      this.teacher=null;
    }
    public List<Student> getStudents() {
        return students;
    }
    public Teacher getTeacher(){
        return this.teacher;
    }
   public String toString(){
        return "Course: " + nameCourse+",address: " + address.getStreet()+ ", " + address.getCity();
   }
}
