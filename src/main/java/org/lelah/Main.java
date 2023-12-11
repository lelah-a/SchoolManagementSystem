package org.lelah;

import org.lelah.dto.*;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem school = new SchoolManagementSystem();

        Department department1 = new Department("Science");
        System.out.println("Departments: ");
        school.displayDepartments();

        Teacher teacher1 = new Teacher("Taylor", "Swift", "D001");
        System.out.println("Teachers: ");
        school.displayTeachers();

        Student student1 = new Student("Lelah", "Atallah","D001");
        System.out.println("Students: ");
        school.displayStudents();

        Course course1 = new Course("Chemistry", 3,"D001");
        school.displayCourses();

        school.registerCourse("S001", "C001");

        System.out.println(school);
    }
}