package org.lelah;

import org.lelah.dto.*;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();

        Department department1 = new Department("Science", );
        Student student1 = new Student("hgj", "hf","Science", 5);
        schoolManagementSystem.findStudent("S001");
        schoolManagementSystem.addStudent();
        schoolManagementSystem.printStudents();

        Teacher teacher1 = new Teacher();
        schoolManagementSystem.addTeacher();
        schoolManagementSystem.findTeacher("T001");
        schoolManagementSystem.printTeachers();

        Department department1 = new Department();
        schoolManagementSystem.findDepartment("D001");

        Course course1 = new Course("", "", 5, 3, "");
        schoolManagementSystem.addCourse();
        schoolManagementSystem.findCourse("C001");
        schoolManagementSystem.registerCourse();

    }
}