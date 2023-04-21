package edu.sda.java.advanced.reflection;

public class Student extends Person {

    private String university;
    protected String faculty;
    String specialization;
    public int year;

    public Student() {
        super("Janek");
    }

    public Student(String name, String university, String faculty) {
        super(name);
        this.university = university;
        this.faculty = faculty;
    }

    public String getUniversity() {
        return university;
    }

    private String info() {
        return "";
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }
}
