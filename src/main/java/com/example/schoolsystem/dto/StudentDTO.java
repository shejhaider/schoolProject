package com.example.schoolsystem.dto;

import java.time.LocalDate;

public class StudentDTO {
    public Long id;
    public String firstName;
    public String lastName;
    public String email;
    public LocalDate dateOfBirth;

    public StudentDTO(Object o, String alice, String smith, String mail, LocalDate of) {
    }
}
