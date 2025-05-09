
package com.example.schoolsystem.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne private Student student;
    @ManyToOne private Course course;
    private LocalDate enrollmentDate;

    @OneToOne(mappedBy = "enrollment", cascade = CascadeType.ALL)
    private Grade grade;

    public <E> Enrollment(Long id, List<E> id1) {
    }

    public Enrollment() {

    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public void setStudentId(Long id) { this.student.setId(id); }
    public void setCourseIds(List id) { }
    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    public LocalDate getEnrollmentDate() { return enrollmentDate; }
    public void setEnrollmentDate(LocalDate enrollmentDate) { this.enrollmentDate = enrollmentDate; }

    public Grade getGrade() { return grade; }
    public void setGrade(Grade grade) { this.grade = grade; }
}
