package com.example.schoolsystem.service;

import com.example.schoolsystem.entity.*;
import com.example.schoolsystem.repository.*;
import com.example.schoolsystem.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SchoolService {
    @Autowired private StudentRepository studentRepo;
    @Autowired private CourseRepository courseRepo;
    @Autowired private EnrollmentRepository enrollmentRepo;
    @Autowired private GradeRepository gradeRepo;

    public Student saveStudent(Student student) {
        return studentRepo.save(student);


    }
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }
    public void deleteStudent(Student student) {
         studentRepo.delete(student);
    }

    public Page<Student> getAllStudents(Pageable pageable) {
        return studentRepo.findAll(pageable);
    }

    public Course saveCourse(Course course) {
        return courseRepo.save(course);
    }

    public Course updateCourse(Course course) {
        return courseRepo.save(course);
    }

    public void deleteCourse(Course course) {
         courseRepo.delete(course);
    }

    public Page<Course> getAllCourses(Pageable pageable) {
        return courseRepo.findAll(pageable);
    }

    public void enrollStudent(Long studentId, List<Long> courseIds) {
        Student student = studentRepo.findById(studentId).orElseThrow();
        for (Long courseId : courseIds) {
            Course course = courseRepo.findById(courseId).orElseThrow();
            Enrollment e = new Enrollment();
            e.setStudent(student);
            e.setCourse(course);
            e.setEnrollmentDate(LocalDate.now());
            enrollmentRepo.save(e);
        }
    }

    public Grade recordGrade(Long enrollmentId, String gradeStr) {
        Enrollment enrollment = enrollmentRepo.findById(enrollmentId).orElseThrow();
        Grade grade = new Grade();
        grade.setEnrollment(enrollment);
        grade.setGrade(gradeStr);
        grade.setGradedAt(LocalDate.now());
        return gradeRepo.save(grade);
    }

    public List<Grade> getGradesByStudent(Long studentId) {
        return gradeRepo.findByEnrollment_Student_Id(studentId);
    }
}
