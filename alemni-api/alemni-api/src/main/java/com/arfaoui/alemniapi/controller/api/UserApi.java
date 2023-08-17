package com.arfaoui.alemniapi.controller.api;

import com.arfaoui.alemniapi.dto.ChangePasswordDto;
import com.arfaoui.alemniapi.dto.UserDto;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.arfaoui.alemniapi.utils.Constants.USER_ENDPOINT;

@Api("users")
public interface UserApi {
    @PostMapping(USER_ENDPOINT + "/create")
    UserDto save(@RequestBody UserDto dto);

    @PostMapping(USER_ENDPOINT + "/update/password")
    UserDto changerMotDePasse(@RequestBody ChangePasswordDto dto);

    @GetMapping(USER_ENDPOINT + "/{idUser}")
    UserDto findById(@PathVariable("idUser") Long id);

    @GetMapping(USER_ENDPOINT + "/find/{email}")
    UserDto findByEmail(@PathVariable("email") String email);

    @GetMapping(USER_ENDPOINT + "/all")
    List<UserDto> findAll();

    @DeleteMapping(USER_ENDPOINT + "/delete/{idUser}")
    void delete(@PathVariable("idUser") Long id);
}
