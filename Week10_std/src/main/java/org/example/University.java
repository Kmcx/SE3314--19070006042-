package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a university with courses and enrolled students.
 */
public class University {

    /**
     * A map representing the courses offered by the university, where the key is the course name
     * and the value is the Course object.
     */
    private Map<String, Course> courses = new HashMap<>();

    /**
     * Constructs a new University.
     */
    public University() {
        // Constructor body (if any initialization is needed)
    }

    /**
     * Adds a course to the university.
     *
     * @param course The course to be added.
     */
    public void addCourse(final Course course) {
        if (course != null && !courses.containsKey(course.getCourseName())) {
            courses.put(course.getCourseName(), course);
        }
    }

    /**
     * Getter method for courses.
     *
     * @return courses.
     */
    public Map<String, Course> getCourses() {
        return courses;
    }

    /**
     * Registers a student for a course.
     *
     * @param student The student to be registered.
     * @param course  The course for which the student is registered.
     */
    public void registerStudentForCourse(final Student student, final Course course) {
        if (courses.containsKey(course.getCourseName())) {
            courses.get(course.getCourseName()).addStudent(student);
        }
    }

    /**
     * Prints enrollments for all courses in the university.
     */
    public void printEnrollments() {
        for (Course course : courses.values()) {
            System.out.println("Course: " + course.getCourseName());
            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName());
            }
        }
    }
}
