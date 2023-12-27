package com.userMicroService.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/{userId}/answers")
public class AnswersController {

    @Autowired
    private AnswersService answersService;

    @GetMapping
    public List<AnswersById> getAnswersByUserId(@PathVariable int userId) {
        return answersService.getAnswersByUserId(userId);
    }
    }

