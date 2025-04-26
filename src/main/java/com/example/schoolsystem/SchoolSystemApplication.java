
package com.example.schoolsystem;

import com.example.schoolsystem.dto.CourseDTO;
import com.example.schoolsystem.dto.EnrollmentRequestDTO;
import com.example.schoolsystem.dto.GradeDTO;
import com.example.schoolsystem.dto.StudentDTO;
import com.example.schoolsystem.entity.Course;
import com.example.schoolsystem.entity.Enrollment;
import com.example.schoolsystem.entity.Grade;
import com.example.schoolsystem.entity.Student;
import com.example.schoolsystem.service.SchoolService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SchoolSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchoolSystemApplication.class, args);

    }
}
