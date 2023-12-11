package org.lelah.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Teacher {
    private static int nextId = 1;

    private String teacherId;
    private String lname;
    private String fname;
    private Department department;
    private String name = fname + " " + lname;

    /**
     *
     * @param departmentId
     * @param lname
     * @param fname
     */
    public Teacher(String fname, String lname, String departmentId) {
        this.teacherId = String.format("T%03d", nextId++);
        this.department = department;
        this.lname = lname;
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", lname='" + lname + '\'' +
                ", fname='" + fname + '\'' +
                ", department=" + department +
                ", name='" + name + '\'' +
                '}';
    }
}
