package com.example.schoolsystem.dto;

import java.util.List;

public class EnrollmentRequestDTO {
    public Long studentId;
    public List<Long> courseIds;

    public <E> EnrollmentRequestDTO(Long id, List<E> id1) {
    }
}
