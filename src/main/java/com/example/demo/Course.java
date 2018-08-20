package com.example.demo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long courseid;
    @Column(name="coursename")
    private String name;

    public Course() {
    }
    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;


    public Set getStudents() {
        return students;
    }

    public void setStudents(Set students) {
        this.students = students;
    }



    public long getCourseid() {
        return courseid;
    }

    public void setCourseid(long courseid) {
        this.courseid = courseid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
