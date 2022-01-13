package com.jeom.jeom.api;

import com.jeom.jeom.age.ApiResponseAge;
import com.jeom.jeom.age.ResponseAge;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
public class ApiController {

    private final ApiService apiService;

    @GetMapping("/age")
    public ResponseAge getAgeController(@RequestParam("name")String name){
       return apiService.requestAge(name);
    }

    @GetMapping("/covid")
    public void getCovid() throws IOException {
        apiService.requestCovid();
    }

}
