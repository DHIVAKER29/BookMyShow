package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dtos.ResponseStatus;
import com.scaler.bookmyshow.dtos.SignInRequestDto;
import com.scaler.bookmyshow.dtos.SignUpRequestDto;
import com.scaler.bookmyshow.dtos.SignUpResponseDto;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDto signUp(SignUpRequestDto requestDto) {
        User user = userService.signUp(requestDto.getName(),
                requestDto.getEmail(),
                requestDto.getPassword());

        SignUpResponseDto responseDto = new SignUpResponseDto();
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        responseDto.setUser(user);
        return responseDto;
    }

    public void signIn(SignInRequestDto requestDto) {
        userService.signIn(
                requestDto.getEmail(),
                requestDto.getPassword()
        );
    }
}