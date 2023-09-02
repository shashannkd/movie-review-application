package com.shashannkd.movieshub.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> testAppRunning(){
        return new ResponseEntity<>("<h1>App is running!!</h1>", HttpStatus.OK);
    }

}
