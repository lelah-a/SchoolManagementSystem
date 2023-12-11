package org.lelah;

import org.lelah.dto.*;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem school = new SchoolManagementSystem();

        Department department1 = new Department("Science");
        Course course1 = new Course("Chemistry", 4, department1);
        Student student1 = new Student("Lelah", "Atallah",department1);
        Teacher teacher1 = new Teacher("Taylor", "Swift", department1);

        school.addStudent(student1);
        school.addTeacher(teacher1);
        school.addCourse(course1);
        school.addDepartment(department1);

        school.displayStudents();
        school.displayTeachers();
        school.displayCourses();
        school.displayDepartments();

        school.findStudent("S001");
        school.findTeacher("T001");
        school.findCourse("C001");
        school.findDepartment("D001");

        System.out.println(school);
    }
}