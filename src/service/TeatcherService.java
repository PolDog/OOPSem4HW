package service;

import model.Teacher;
import model.User;

import java.util.List;
import java.util.Scanner;

public class TeatcherService {
    public TeatcherService() {
        scanner = new Scanner(System.in);
    }

    Scanner scanner;

    public User createNewtecher(User teacher) {
        return teacher;
    }

    public void editTeacher(List<Teacher> teachers) {
        int id = Integer.parseInt(getText("Enter id for edit: ")) - 1;
        System.out.println(teachers.get(id).getId() + " ----------- " + id);
        System.out.println(teachers.get(id).getName());
        teachers.get(id).setName(getText("Enter new name: "));
        scanner.close();
    }

    private String getText(String infoText) {
        System.out.printf(infoText);
        String text = scanner.next();
        System.out.println("enter (" + text + ")");
        return text;
    }
}
