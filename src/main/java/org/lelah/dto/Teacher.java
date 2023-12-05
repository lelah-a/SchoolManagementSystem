package org.lelah.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Teacher {
    private static int nextId = 1;
    private String lname;
    private String fname;
    private Department department;
    private String id;
    private String name = fname + " " + lname;

    public void toString(String name, Department department, String lname, String fname, String id) {
        this.name = name;
        this.department = department;
        this.lname = lname;
        this.fname = fname;
        this.id = String.format("T%03d", nextId++);;
    }
}
