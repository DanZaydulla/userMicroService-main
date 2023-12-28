package com.userMicroService.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(
        name = "pollMicroService",
        url = "${poll_micro_service.url}"
)
public interface AnswersService {

    @GetMapping(path = "/answer/by_user_id")
    List<AnswersById> getAnswersByUserId(@RequestParam int userId);

    @DeleteMapping("/answer/{userId}")
    String deleteAnswersByUserId(@PathVariable int userId);
}
