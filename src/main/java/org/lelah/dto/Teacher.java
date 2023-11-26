package org.lelah.dto;

public class Teacher {
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
        this.id = id;
    }
}
