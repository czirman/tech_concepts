package org.czirman;

import org.czirman.entities.UsersEntity;
import org.czirman.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryErrorTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void shouldThrowNotNullError() {
        UsersEntity user = UsersEntity.builder()
                .username(null) // <--- NULL dla pola z nullable = false
                .build();
        userRepository.saveAndFlush(user);
    }
}
