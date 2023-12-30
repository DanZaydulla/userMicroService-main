package com.userMicroService.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@FeignClient(
        name = "pollMicroService",
        url = "${poll_micro_service.url}"
)
public interface AnswersService {


    @GetMapping(value = "/answer/by_user_id/{userId}")
    public List<AnswersById> getAnswersByUserId(@PathVariable int userId);

    @DeleteMapping("/answer/delete_answers_by_user_id/{userId}")
    String deleteAnswersByUserId(@PathVariable int userId);

}
