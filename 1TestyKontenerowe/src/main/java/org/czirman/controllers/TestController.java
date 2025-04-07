package org.czirman.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
// url http://localhost:8080/test
public class TestController {

    @GetMapping(path ="/test")
    public ResponseEntity<String> test(/* final @RequestBody CreditAss cs */){
        return new ResponseEntity("ff", HttpStatus.OK);

    }
}
