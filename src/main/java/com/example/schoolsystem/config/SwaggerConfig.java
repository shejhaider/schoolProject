package com.example.schoolsystem.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "School System API", version = "1.0", description = "Manage students, courses, and grades"))
public class SwaggerConfig {}
