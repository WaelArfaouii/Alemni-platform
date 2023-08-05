package com.arfaoui.alemniapi.controller;

import com.arfaoui.alemniapi.controller.api.UserApi;
import com.arfaoui.alemniapi.dto.ChangePasswordDto;
import com.arfaoui.alemniapi.dto.UserDto;

import java.util.List;

public class UserController implements UserApi {

    @Override
    public UserDto save(UserDto dto) {
        return null;
    }

    @Override
    public UserDto changerMotDePasse(ChangePasswordDto dto) {
        return null;
    }

    @Override
    public UserDto findById(Long id) {
        return null;
    }

    @Override
    public UserDto findByEmail(String email) {
        return null;
    }

    @Override
    public List<UserDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
