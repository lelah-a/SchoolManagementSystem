package org.lelah.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Course {
    private static int nextId = 1;
    private static final int MAX_STUDENTS_PER_COURSE = 5;

    private String id;
    private double credit;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    public Course(Teacher teacher, String courseName, Student[] students, double credit , int studentNum, Department department) {
        this.id = String.format("C%03d", nextId++);
        this.teacher = teacher;
        this.courseName = courseName;
        this.students = new Student[MAX_STUDENTS_PER_COURSE];
        this.credit = credit;
        this.studentNum = studentNum;
        this.department = department;
    }
}
