package org.lelah.dto;

public class Course {
    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    public void toString(Teacher teacher, String courseName, Student[] students, double credit , int studentNum, Department department, String id) {
        this.teacher = teacher;
        this.courseName = courseName;
        this.students = students;
        this.credit = credit;
        this.studentNum = studentNum;
        this.department = department;
        this.id = id;
    }
}
