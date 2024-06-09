package controller;

import model.Teacher;
import model.User;
import service.TeatcherService;
import view.TeatcherView;
import view.UserView;

import java.util.List;

public class TeacherController implements UserController {
    private UserView<Teacher> view = new TeatcherView();
    private TeatcherService service = new TeatcherService();

    @Override
    public <T extends User> User create(T teacher) {
        return service.createNewtecher(teacher);
    }

    public void sendOnConsole(List<Teacher> teachers) {
        view.sendOnConsole(teachers);
    }

    public void editTeacher(List<Teacher> teachers) {
        service.editTeacher(teachers);
        sendOnConsole(teachers);
    }
}
