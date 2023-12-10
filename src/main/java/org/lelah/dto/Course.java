package org.lelah.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Course {
    private static int nextId = 1;
    private static final int MAX_STUDENTS_PER_COURSE = 5;

    private String courseId;
    private double credit;
    private Student[] students;
    private Department department;
    private Teacher teacher;
    private String courseName;

    /**
     *
     * @param teacher
     * @param courseName
     * @param students
     * @param credit
     * @param department
     */
    public Course(Teacher teacher, String courseName, Student[] students, double credit , int studentNum, Department department) {
        this.courseId = String.format("C%03d", nextId++);
        this.teacher = teacher;
        this.courseName = courseName;
        this.students = new Student[MAX_STUDENTS_PER_COURSE];
        this.credit = credit;
        this.department = department;
    }
}
