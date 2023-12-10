package org.lelah.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SchoolManagementSystem {
    private static final int MAX_DEPARTMENTS = 5;
    private static final int MAX_STUDENTS = 200;
    private static final int MAX_TEACHERS = 20;
    private static final int MAX_COURSES = 30;
    private static final int MAX_COURSES_PER_STUDENT = 5;
    private static final int MAX_STUDENTS_PER_COURSE = 5;
    private static int nextId = 1;

    private Course[] courses;
    private int courseNum = 0;
    private Department[] departments;
    private int departmentNum = 0;
    private Student[] students;
    private int studentNum = 0;
    private Teacher[] teachers;
    private int teacherNum = 0;

    public SchoolManagementSystem() {
        this.courses = new Course[MAX_COURSES];
        this.departments = new Department[MAX_DEPARTMENTS];
        this.students = new Student[MAX_STUDENTS];
        this.teachers = new Teacher[MAX_TEACHERS];
    }

    /**
     * method to add a department until the max number of departments are reached
     *
     * @param department
     */
    public void addDepartment(Department department) {
        if (departmentNum < MAX_DEPARTMENTS) {
            departments[departmentNum] = department;
            departmentNum++;
        } else if(departments.equals(null)) {
            break;
        }
        else {
            System.out.printf("There are already %d departments, add department failed.", MAX_DEPARTMENTS);
        }
    }

    /**
     * method to find a department using the department id
     * if the id doesn't match anything return null
     *
     * @param departmentId
     * @return
     */
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department.getDepartmentId().equals(departmentId)) {
                return department;
            }
        }
        return null;
    }

    /**
     * method to print all the departments
     */
    public void printDepartments() {
        for (int i = 0; i < MAX_DEPARTMENTS; i++) {
            if (departments != null) {
                System.out.println(departments);
            }
        }
    }

    /**
     * method to add a teacher until the maximum amount of teachers are reached
     *
     * @param teacher
     */
    public void addTeacher(Teacher teacher) {
        if (teacherNum < MAX_TEACHERS) {
            teachers[teacherNum] = teacher;
            teacherNum++;
        } else {
            System.out.printf("There are already %d teachers, add teacher failed.", MAX_TEACHERS);
        }
    }

    /**
     * method to find a teacher using their id
     * if the id doesn't match anything return null
     *
     * @param teacherId
     * @return
     */
    public Teacher findTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    /**
     *
     */
    public void printTeachers(Teacher teacher) {
        for (int i = 0; i < MAX_TEACHERS; i++) {
            if (teachers != null) {
                System.out.println(teachers);
            }
        }

    }

    /**
     * method to modify the course teacher
     */
    public void modifyCourseTeacher() {

    }

    /**
     * @param student
     */
    public void addStudent(Student student) {
        if (studentNum < MAX_STUDENTS) {
            students[studentNum] = student;
            studentNum++;
        } else {
            System.out.printf("There are already %d students, add student failed.", MAX_STUDENTS);
        }
    }

    /**
     * method to find a student using their Id
     * if the id doesn't match anything return null
     *
     * @param studentId
     * @return
     */
    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    /**
     *
     */
    public void printStudents() {
        for (int i = 0; i < MAX_STUDENTS; i++) {
            if (students != null) {
                System.out.println(students);
            }
        }
    }

    /**
     * method to add a course until the max number of courses is reached
     *
     * @param course
     */
    public void addCourse(Course course) {
        if (courseNum < MAX_COURSES) {
            courses[courseNum] = course;
            courseNum++;
        } else {
            System.out.printf("There are already %d courses, add course failed.", MAX_COURSES);
        }
    }

    /**
     * method to find course using the course id
     * if the id doesn't match anything return null
     *
     * @param courseId
     * @return
     */
    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }
}

    /**
     *
     */
    /*public void registerCourse() {
        Student student = findStudent("");
        Course course = findCourse("");
        if (student != null && course != null) {
            student.setCourses(course);

        }
    }*/



