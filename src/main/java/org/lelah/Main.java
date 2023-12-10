package org.lelah;

import org.lelah.dto.*;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();

        Department department1 = new Department("Science");
        Course course1 = new Course("Chemistry", 4, department1);
        Student student1 = new Student("Lelah", "Atallah",department1);
        Teacher teacher1 = new Teacher("Taylor", "Swift", department1);
        schoolManagementSystem.addStudent(student1);
        schoolManagementSystem.addCourse(course1);
        schoolManagementSystem.addDepartment(department1);

        System.out.println(schoolManagementSystem);
    }
}