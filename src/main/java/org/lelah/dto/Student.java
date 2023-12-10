package org.lelah.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Student {
    private static int nextId = 1;

    private String id;
    private String fname;
    private String lname;
    private String name;
    private Course[] courses;
    private int courseNum;
    private Department department;

    public Student(String fname, String lname, int courseNum, Department department, Course[] courses) {
        this.id = String.format("S%03d", nextId++);
        this.name = fname + " " + lname;
        this.fname = fname;
        this.courseNum = courseNum;
        this.department = department;
        this.courses = courses;
        this.lname = lname;
    }
}
