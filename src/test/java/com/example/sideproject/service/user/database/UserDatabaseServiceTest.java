package com.example.sideproject.service.user.database;

import com.example.sideproject.service.user.User;
import com.example.sideproject.service.user.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 윤수경 (trrw0531@gmail.com)
 */
@SpringBootTest
class UserDatabaseServiceTest {
    @Autowired
    private UserService userService;
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    void save() {
        final String Id = UUID.randomUUID().toString().replace("-", "");
        User parameter = User.builder()
                .id(Id)
                .name("윤두경")
                .phone("01038660764")
                .email("trrw0531@gmail.com")
                .residence("송파구")
                .isEnabled(true)
                .build();
        User save = userService.save(parameter);
        log.info("[save] {}", save);
    }

    @Test
    void get() {
        User get = userService.get("c844791b65d64d4c8c9279b1bb477910").orElse(null);
        log.info("get={}", get);
    }

    @Test
    void testGet() {
        List<User> get = userService.get();
        get.forEach(user -> log.info("getList={}", user));
    }

    @Test
    void edit() {
        User parameter = User.builder()
                .name("윤두경")
                .phone("01038660764")
                .email("trrw0531@gmail.com")
                .residence("송파구")
                .updater("심다봉")
                .isEnabled(true)
                .build();
        User edit = userService.edit("c844791b65d64d4c8c9279b1bb477910", parameter);
        log.info("edit={}", edit);
    }

    @Test
    void delete() {
        userService.delete("c844791b65d64d4c8c9279b1bb477910");
    }
}