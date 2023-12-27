package com.userMicroService.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(
        name = "pollMicroService",
        url = "${poll_Micro_Service.url}"
)
public interface AnswersService {

    @GetMapping("/users/answers")
    List<AnswersById> getAnswersByUserId(@RequestParam("userId") int userId);
}
