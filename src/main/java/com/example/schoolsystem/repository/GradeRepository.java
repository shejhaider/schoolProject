package com.example.schoolsystem.repository;

import com.example.schoolsystem.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GradeRepository extends JpaRepository<Grade, Long> {
    List<Grade> findByEnrollment_Student_Id(Long studentId);
}
