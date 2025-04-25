
package com.example.schoolsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne private Enrollment enrollment;
    @NotBlank private String grade;
    private LocalDate gradedAt;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Enrollment getEnrollment() { return enrollment; }
    public void setEnrollment(Enrollment enrollment) { this.enrollment = enrollment; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public LocalDate getGradedAt() { return gradedAt; }
    public void setGradedAt(LocalDate gradedAt) { this.gradedAt = gradedAt; }
}
