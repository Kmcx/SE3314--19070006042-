package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a course offered by a university.
 */
public class Course {
    /**
     *  The number of total courses.
     */
    private static int totalCourses = 0;

    /**
     * The name of the course.
     */
    private final String courseName;

    /**
     * The maximum capacity of the course.
     */
    private final int capacity;

    /**
     * The list of students enrolled in the course.
     */
    private final List<Student> students = new ArrayList<>();

    /**
     * Constructs a new Course with the given name and capacity.
     *
     * @param name     The name of the course.
     * @param capacity The maximum capacity of the course.
     */
    public Course(final String name, final int capacity) {
        this.courseName = name;
        this.capacity = capacity;
        totalCourses++;
    }

    /**
     * Adds a student to the course if there is available space.
     *
     * @param student The student to be added.
     */
    public void addStudent(final Student student) {
        if (students.size() < capacity) {
            students.add(student);
        }
    }

    /**
     * Gets the name of the course.
     *
     * @return The name of the course.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Gets the total number of courses created.
     *
     * @return The total number of courses.
     */
    public static int getTotalCourses() {
        return totalCourses;
    }

    /**
     * Gets the list of students enrolled in the course.
     *
     * @return The list of students.
     */
    public List<Student> getStudents() {
        return students;
    }

}
