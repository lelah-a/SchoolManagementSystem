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
     * if the max number of departments has been reached print a message
     * @param department
     */
    public void addDepartment(Department department) {
        if (departmentNum < MAX_DEPARTMENTS) {
            departments[departmentNum] = department;
            departmentNum++;
        } else {
            System.out.printf("There are already %d departments, add department failed.", MAX_DEPARTMENTS);
        }
    }

    /**
     * method to find a department using the department id
     * if the id doesn't match anything return null
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
    public void displayDepartments() {
        for (int i = 0; i < MAX_DEPARTMENTS; i++) {
            System.out.println(departments[i]);
        }
    }

    /**
     * method to add a teacher until the maximum amount of teachers are reached
     * if the max amount of teachers is reached print a message
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
     * method to display all of the teachers
     */
    public void displayTeachers() {
        for (int i = 0; i < MAX_TEACHERS; i++) {
            System.out.println(teachers[i]);
        }
    }

    /**
     * method to Assign a teacher to a specific course, based on teacherId and courseId,
     * if no teacher or course can be found with those ids, print a message
     */
    public void modifyCourseTeacher(String courseId, Teacher newTeacher) {
        Course courseToUpdate = findCourse(courseId);
        if (courseToUpdate != null) {
            courseToUpdate.setTeacher(newTeacher);
            System.out.println("Course teacher modified successfully!");
        } else {
            System.out.println("Course not found");
        }
    }

    /**
     * method to add a student until the max amount has been reached
     * if the max amount has been reached print a message
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
     * method to display all the students
     */
    public void displayStudents() {
        for (int i = 0; i < MAX_STUDENTS; i++) {
            System.out.println(students[i]);
        }
    }

    /**
     * method to add a course until the max number of courses is reached
     * if the max has been reached print a message
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

    /**
     * method to display all the courses
     */
    public void displayCourses() {
        for (int i = 0; i < MAX_COURSES; i++) {
            System.out.println(courses[i]);
        }
    }

    /**
     * method to register a course for a student, based on studentId and courseId, which will check
     * If the studentId or courseId does not match with anything, print a message.
     * If the student has register max amount courses (5), print a message.
     * If the course has be registered by the max number of students (5), print a message.
     * @param studentId
     * @param courseId
     */
    public void registerCourse(String studentId, String courseId) {
        int coursesRegistered = 0;
        int studentsRegistered = 0;

        Student student = findStudent(studentId);
        Course course = findCourse(courseId);

        if (studentId == null || courseId == null) {
            System.out.println("This student or course do not exist.");
            return;
        }
        for (Course registeredCourse : student.getCourses()) {
                if (registeredCourse != null) {
                    coursesRegistered++;
                }
        }
        for (Student registeredStudent : course.getStudents()) {
                if (registeredStudent != null) {
                    studentsRegistered++;
                }
        }
        if (coursesRegistered >= MAX_COURSES_PER_STUDENT) {
            System.out.println("Maximum amount of courses have been registered");
        } else if (studentsRegistered >= MAX_STUDENTS_PER_COURSE) {
            System.out.println("Maximum amount of students have registered");
        }
        else {
            if (courseNum < MAX_COURSES_PER_STUDENT && studentNum < MAX_STUDENTS_PER_COURSE) {
                if (addStudentToCourse(student, course) && registerCourseForStudent(student, course)) {
                    System.out.println("Student sucessfully registered!");
                } else {
                    System.out.println("Registration failed");
                }
            }
        }
    }

    /**
     * method to check if the max students per course has been reached
     * @param student
     * @param course
     * @return
     */
    private boolean addStudentToCourse(Student student, Course course) {
        int studentNum = getStudentNum();
        if (studentNum < MAX_STUDENTS_PER_COURSE) {
            course.getStudents()[studentNum] = student;
            setStudentNum(studentNum + 1);
            return true;
        }
        return false;
    }

    /**
     * boolean method to check if the max courses per student has been reached
     * @param student
     * @param course
     * @return
     */
    private boolean registerCourseForStudent(Student student, Course course) {
        int courseNum = getCourseNum();
        if (courseNum < MAX_COURSES_PER_STUDENT) {
            student.getCourses()[courseNum] = course;
            setCourseNum(courseNum + 1);
            return true;
        }
        return false;
    }
}
