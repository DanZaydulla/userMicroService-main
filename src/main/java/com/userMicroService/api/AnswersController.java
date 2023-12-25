package com.userMicroService.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswersController {

    @Autowired
    private AnswersService answersService;

    @GetMapping
    public AnswersById getAnswersById(@RequestParam int userId) {
        return answersService.getAnswersById(userId);
    }
}
