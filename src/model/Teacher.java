package model;

public class Teacher extends User{

    public Teacher(int id, String name, String last) {
        this.id = id;
        this.name = name;
        this.last = last;
    }
    @Override
    public String toString() {
        return String.format("Teacher [id=%d, name=%s, lastName=%s]", id, name, last);
    }
}
