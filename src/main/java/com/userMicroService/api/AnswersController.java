package com.userMicroService.api;


import com.userMicroService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswersController  {

    @Autowired
    private AnswersService answersService;
    @Autowired
    private UserService userService;

    @GetMapping(value = "/by_id/{userId}")
    public List<AnswersById> getAnswersByUserId(@PathVariable int userId) {
        return answersService.getAnswersByUserId(userId);
    }

    @DeleteMapping(value = "/delete_by_id/{userId}")
    public String deleteAnswersByUserId(@PathVariable int userId) {
        return answersService.deleteAnswersByUserId(userId);
    }
    @GetMapping(value = "/answered/{questionId}")
    public int getTotalUsersAnsweredForQuestion(@PathVariable int questionId) {
        return answersService.getTotalUsersAnsweredForQuestion(questionId);
    }
    }

