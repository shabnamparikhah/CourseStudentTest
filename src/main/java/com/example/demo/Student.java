package com.example.demo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String department;
    private String email;


    @ManyToMany
    @JoinTable(name="student_course",
            joinColumns = @JoinColumn(name = "STUDENT_ID",referencedColumnName = "ID"),inverseJoinColumns = @JoinColumn(name = "COURSE_ID",referencedColumnName = "courseid"))
    private Set<Course> courses;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
