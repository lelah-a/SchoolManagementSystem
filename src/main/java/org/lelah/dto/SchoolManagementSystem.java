package org.lelah.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class SchoolManagementSystem {
    private static final int MAX_DEPARTMENTS = 5;
    private static final int MAX_STUDENTS = 200;
    private static final int MAX_TEACHERS = 20;
    private static final int MAX_COURSES = 30;
    private static final int MAX_COURSES_PER_STUDENT = 5;
    private static final int MAX_STUDENTS_PER_COURSE = 5;
    private static int nextId = 1;

    private Course[] courses;
    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;








    public void findDepartment() {
        for () {
            if () {
                System.out.println("Found department: " + );
            }
        }
    }
    public void addDepartment(Department department) {
        if (dishes[0] == null) {
            dishes[0] = dish;
            calcPrice();
        } else if (dishes[1] == null) {
            dishes[1] = dish;
            calcPrice();
        } else {
            System.out.printf("There are already %d dishes, add dish failed.", MAX_DISH_NUM);

    }
    public void printDepartments() {
    }

    public void printTeachers() {
    }

    public void modifyCourseTeacher() {
    }


    public void printStudents() {
    }

    public Student findStudent() {
        for () {
            if () {
                System.out.println("Found student: " + );
            }
        }
    }

    public void addCourse() {
    }

    public void registerCourse() {
    }

    public void addTeacher() {
    }

    public Course findCourse() {
        for () {
            if () {
                System.out.println("Found course: " + );
            }
        }
    }


    public void addStudent() {
    }

    public Teacher findTeacher() {
        for () {
            if () {
                System.out.println("Found teacher: " + );
            }
        }
    }
}
