package com.test;

import com.test.entity.UserEntity;
import com.test.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@Profile("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MysqlJpaTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void test_should_increase_sequence() {

        UserEntity userEntity = new UserEntity();
        userEntity.setName("hong gil dong");

        UserEntity saved = userRepository.saveAndFlush(userEntity);

        Assertions.assertNotNull(saved.getOid());
    }
}
