package com.company;

/**
 * Created by admin on 4/20/17.
 */
public class Student {
    private String name;
    private int studentID, numCredits, totalGrades;

    public Student(String name, int studentID) {
        //a constructor that initializes the name and id fields
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        //a method that returns the student name field
        return name;
    }

    public int getStudentID() {
        //a method that returns the student ID field
        return studentID;
    }

    public boolean equals(Student student) {
        //a method that determines if two student objects are equal if their student id numbers are the same (override equals from the class Object)
         boolean result;
             if(student.getStudentID() == this.getStudentID()) {
                result = true;
            } else {
                result = false;
             }
        return result;
    }

    public void setNumCredits(int credits) {
        //methods to set and retrieve the total number of credits
        numCredits = credits;
    }
    public int getNumCredits() {
        return numCredits;
    }

    public void setTotalGrades(int grades) {
        //methods to set and retrieve the total number of grade points earned
        totalGrades = grades;
    }
    public int getTotalGrades() {
        return totalGrades;
    }

    public int getGPA() {
        //a method that returns the GPA(Grade points divided by credits)
        int gpa = totalGrades / numCredits;
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

