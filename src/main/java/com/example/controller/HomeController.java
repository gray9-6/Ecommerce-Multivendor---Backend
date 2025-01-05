package com.example.controller;

import com.example.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ApiResponse homeController(){
        return new ApiResponse()
                .setMessage("Hello");
    }
}
