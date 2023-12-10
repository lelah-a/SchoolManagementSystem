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
     * @param courseName
     * @param credit
     * @param department
     */
    public Course(String courseName, double credit, Department department) {
        this.courseId = String.format("C%03d", nextId++);
        this.teacher = teacher;
        this.courseName = courseName;
        this.students = new Student[MAX_STUDENTS_PER_COURSE];
        this.credit = credit;
        this.department = department;
    }
}
