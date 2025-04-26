package com.example.schoolsystem.controller;

import com.example.schoolsystem.dto.*;
import com.example.schoolsystem.entity.*;
import com.example.schoolsystem.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SchoolController {

    @Autowired private SchoolService service;

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @PostMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @PostMapping("/students")
    public void deleteStudent(@RequestBody Student student) {
         service.deleteStudent(student);
    }

    @GetMapping("/students")
    public Page<Student> getAllStudents(Pageable pageable) {
        return service.getAllStudents(pageable);
    }


    @PostMapping("/courses")
    public Course createCourse(@RequestBody Course course) {
        return service.saveCourse(course);
    }

    @PostMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return service.updateCourse(course);
    }

    @PostMapping("/courses")
    public void deleteCourse(@RequestBody Course course) {
         service.deleteCourse(course);
    }

    @GetMapping("/courses")
    public Page<Course> getAllCourses(Pageable pageable) {
        return service.getAllCourses(pageable);
    }

    @PostMapping("/enroll")
    public void enrollStudent(@RequestBody EnrollmentRequestDTO dto) {
        service.enrollStudent(dto.studentId, dto.courseIds);
    }

    @PostMapping("/grades")
    public Grade recordGrade(@RequestBody GradeDTO dto) {
        return service.recordGrade(dto.enrollmentId, dto.grade);
    }

    @GetMapping("/students/{id}/grades")
    public List<Grade> getGrades(@PathVariable Long id) {
        return service.getGradesByStudent(id);
    }
}
