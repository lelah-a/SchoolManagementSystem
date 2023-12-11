package org.lelah;

import org.lelah.dto.*;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem school = new SchoolManagementSystem();

        Department department1 = new Department("Science");
        school.addDepartment(department1);
        System.out.println("Departments: ");
        school.displayDepartments();

        Teacher teacher1 = new Teacher("Taylor", "Swift", "D001");
        school.addTeacher(teacher1);
        System.out.println("Teachers: ");
        school.displayTeachers();

        Student student1 = new Student("Lelah", "Atallah","D001");
        school.addStudent(student1);
        System.out.println("Students: ");
        school.displayStudents();

        Course course1 = new Course("Chemistry", 3,"D001");
        school.addCourse(course1);
        System.out.println("Courses: ");
        school.displayCourses();
        school.modifyCourseTeacher("C001", new Teacher("Gracie", "Abrams", "D002"));


        school.registerCourse("S001", "C001");
    }
}