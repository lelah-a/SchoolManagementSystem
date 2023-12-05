package org.lelah.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Student {
    private String fname;
    private String lname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private int nextId;
    private Department department;
    private String name = fname + " " + lname;;

    public void toString(int nextId, String name, String fname, int courseNum, Department department, Course[] courses, String lname, String id) {
        this.nextId = nextId;
        this.name = name;
        this.fname = fname;
        this.courseNum = courseNum;
        this.department = department;
        this.courses = courses;
        this.lname = lname;
        this.id = id;
    }
}
