import controller.StudentController;
import controller.TeacherController;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(2, "Ira", "Ivanova")));
        List<Teacher> list = new ArrayList<>();
        TeacherController teacherController = new TeacherController();

        list.add((Teacher) teacherController.create(new Teacher(1, "Петр", "Иванович")));
        list.add((Teacher) teacherController.create(new Teacher(2, "Александр", "Петрович")));

        teacherController.sendOnConsole(list);
        teacherController.editTeacher(list);
    }

}