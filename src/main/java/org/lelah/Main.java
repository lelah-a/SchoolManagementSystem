package org.lelah;

import org.lelah.dto.*;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem1 = new SchoolManagementSystem();

        Student student1 = new Student();
        SchoolManagementSystem.addStudent();

        Teacher teacher1 = new Teacher();
        SchoolManagementSystem.addTeacher();


        Course course1 = new Course();
        SchoolManagementSystem.addCourse();

        Department department1 = new Department();
        SchoolManagementSystem.addDepartment();




    }
}