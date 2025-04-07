package org.czirman.controllers;

import lombok.AllArgsConstructor;
import org.czirman.entities.UsersEntity;
import org.czirman.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
// url http://localhost:8080/test
public class TestController {

    private final UserRepository userRepository;

    @GetMapping(path ="/test")
    public ResponseEntity<String> test(/* final @RequestBody CreditAss cs */){
        UsersEntity usersEntity = UsersEntity.builder()
                .username("lola")
                .build();
        userRepository.save(usersEntity);
        return new ResponseEntity("ff", HttpStatus.OK);

    }
}
