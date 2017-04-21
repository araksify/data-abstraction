package com.company;

/**
 * Created by admin on 4/20/17.
 */
public class Course {
    private String courseName, instructor;
    private int registrCode, numOfStudents;
    private final int MAX_NUM_STUDENTS = 35;
    private int[] studentsRegistered = new int[MAX_NUM_STUDENTS];


    public Course(String courseName, int registrCode, int max_num) {
        max_num = MAX_NUM_STUDENTS;
        this.courseName = courseName;
        this.registrCode = registrCode;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getInstructor() {
        return instructor;
    }

    public boolean searchStudent(int id) {
        //A method to search for a student in the course; the search should be based on an ID number.
        boolean result = false;
        for(int i = 0; i < studentsRegistered.length; i++) {
            if(id == studentsRegistered[i]) {
                result = true;
            } else {
                System.out.println("ID not found!");
                result = false;
            }
        }
        return result;
    }

    //A method to add a student to the course. If the course is full, then an exception with an appropriate message should be raised
    //(try creating your own exception class for this). Also, be sure that the student is not already registered in the course.
    //The list of students should be in the order that they registered.
    public void addStudent(int id) {
        int insertIndex = studentsRegistered.length + 1;
        System.out.println(insertIndex);
        System.out.println("Enter Student ID you want to have in the course");



    }

}
