package org.lelah.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Teacher {
    private static int nextId = 1;

    private String teacherId;
    private String lname;
    private String fname;
    private Department department;
    private String name = fname + " " + lname;

    /**
     *
     * @param department
     * @param lname
     * @param fname
     */
    public Teacher(String fname, String lname, Department department) {
        this.teacherId = String.format("T%03d", nextId++);
        this.department = department;
        this.lname = lname;
        this.fname = fname;
    }
}
