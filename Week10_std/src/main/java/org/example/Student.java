package org.example;

/**
 * Represents a student enrolled in a university.
 */
public class Student {
    /**
     * The name of the student.
     */
    private String studentName;

    /**
     * The ID of the student.
     */
    private String studentID;

    /**
     * Constructs a new Student with the given name and ID.
     *
     * @param name The name of the student.
     * @param id   The ID of the student.
     */
    public Student(final String name, final String id) {
        this.studentName = name;
        this.studentID = id;
    }

    /**
     * Gets the name of the student.
     *
     * @return The name of the student.
     */
    public String getName() {
        return studentName;
    }

    /**
     * Gets the ID of the student.
     *
     * @return The ID of the student.
     */
    public String getStudentID() {
        return studentID;
    }
}
