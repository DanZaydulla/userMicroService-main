package com.userMicroService.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "answersService",
        url = "${answers_service.url}"
)
public interface AnswersService {

    @GetMapping(path = "answers")
    AnswersById getAnswersById(@PathVariable int userId);

}
