package com.company;

/**
 * Created by admin on 4/20/17.
 */
public class Instructor {
    private String name, department;
    private int facultyIDNum;

    public Instructor(String name, int facultyIDNum) {
        //A constructor that initializes the name and id fields
        this.name = name;
        this.facultyIDNum = facultyIDNum;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                '}';
    }
}
