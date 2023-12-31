package org.lelah.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
@EqualsAndHashCode
public class Student {
    private static int nextId = 1;
    private static final int MAX_COURSES_PER_STUDENT = 5;

    private String studentId;
    private String fname;
    private String lname;
    private String name;
    private Course[] courses;
    private Department department;

    /**
     * @param fname
     * @param lname
     * @param departmentId
     */
    public Student(String fname, String lname, String departmentId) {
        this.studentId = String.format("S%03d", nextId++);
        this.name = fname + " " + lname;
        this.fname = fname;
        this.department = department;
        this.courses = new Course[MAX_COURSES_PER_STUDENT];
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", name='" + name + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", department=" + department +
                '}';
    }
}
