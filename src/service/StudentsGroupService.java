package service;

import model.Student;
import model.StudentGroup;

import java.util.Collections;
import java.util.List;

public class StudentsGroupService {
    private StudentGroup studentGroup;

    public StudentsGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student) {
        studentGroup.students.add(student);
    }

    public List<Student> sort() {
        Collections.sort(studentGroup.students);
        return studentGroup.students;
    }
}
