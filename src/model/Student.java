package model;

public class Student extends User {
    public Student(int id, String name, String last) {
        this.id = id;
        this.name = name;
        this.last = last;
    }


    @Override
    public String toString() {
        return String.format("Student [id=%d, name=%s, lastName=%s]", id, name, last);
    }


}
