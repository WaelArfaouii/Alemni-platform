package com.arfaoui.alemniapi.dto;

import com.arfaoui.alemniapi.model.User;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class UserDto {

    private Long id;

    private String fName;

    private String lName;

    private String email;

    private Instant dateOfBirth;

    private String password;

    private String address;
    private String phoneNumber ;

    private String photo;

    private List<RolesDto> roles;

    public static UserDto fromEntity(User user) {

        if (user ==null) {
            return null ;
        }

        return UserDto.builder()
                .id(user.getId())
                .address(user.getAddress())
                .dateOfBirth(user.getDateOfBirth())
                .email(user.getMail())
                .fName(user.getFName())
                .lName(user.getLName())
                .photo(user.getPhoto())
                .password(user.getPassword())
                .phoneNumber(user.getPhoneNumber())
                .roles(user.getRoles()!=null ?
                        user.getRoles().stream()
                                .map(RolesDto::fromEntity)
                                .collect(Collectors.toList()):null

                        )
                .build();
    }

    public static User toEntity(UserDto userDto){

        if (userDto==null) {
            return null ;
        }

        User user = new User() ;
        user.setMail(userDto.email);
        user.setPassword(userDto.password);
        user.setFName(userDto.fName);
        user.setLName(userDto.lName);
        user.setAddress(userDto.address);
        user.setPhoto(userDto.photo);
        user.setPhoneNumber(userDto.phoneNumber);
        user.setDateOfBirth(userDto.dateOfBirth);

        return user ;
    }
}
