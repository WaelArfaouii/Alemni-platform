package com.arfaoui.alemniapi.dto;

import java.time.Instant;
import java.util.List;

public class UserDto {
    private Long id;

    private String fName;

    private String lName;

    private String email;

    private Instant dateOfBirth;

    private String password;

    private String address;

    private String photo;

    private List<RolesDto> roles;
}
