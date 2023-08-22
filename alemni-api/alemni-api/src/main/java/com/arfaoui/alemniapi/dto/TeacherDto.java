package com.arfaoui.alemniapi.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class TeacherDto {

    private Long id;

    private String fName;

    private String lName;

    private String email;

    private Instant dateOfBirth;

    private String address;

    private String photo;
}
