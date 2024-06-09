package controller;

import model.Student;
import service.StudentsGroupService;


public class StudentGroupController{

    private StudentsGroupService service;

    public StudentGroupController(StudentsGroupService service) {
        this.service = service;
    }

    public void addStudent(Student student) {
        service.addStudent(student);
    }
}
