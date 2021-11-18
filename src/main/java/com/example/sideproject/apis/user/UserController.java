package com.example.sideproject.apis.user;

import com.example.sideproject.service.user.User;
import com.example.sideproject.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author 윤수경 (trrw0531@gmail.com)
 */
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserResourceConverter userResourceConverter;
    private final UserService userService;
    private final Logger log;

    public UserController(UserResourceConverter userResourceConverter, UserService userService) {
        this.userResourceConverter = userResourceConverter;
        this.userService = userService;
        this.log = LoggerFactory.getLogger(this.getClass());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResource add(@RequestBody UserResource userResource) {
        log.info("[add] userResource={}", userResource);
        User parameter = userResourceConverter.to(userResource);
        final String ID = UUID.randomUUID().toString().replace("-", "");
        parameter.setId(ID);
        User add = userService.save(parameter);
        return userResourceConverter.from(add);
    }

    @GetMapping("/{id}")
    public UserResource get(@PathVariable String id) {
        log.info("[get] id={}", id);
        return userService.get(id)
                .map(userResourceConverter::from)
                .orElseThrow(NoSuchElementException::new);
    }

    @GetMapping
    public UserListResource get() {
        log.info("[get]");
        return new UserListResource(userService.get()
                .stream().map(userResourceConverter::from)
                .collect(Collectors.toCollection(LinkedList::new)));
    }

    @PutMapping("/{id}")
    public UserResource edit(@PathVariable String id, @RequestBody UserResource userResource) {
        log.info("[edit] id={}, userResource={}", id, userResource);
        User parameter = userResourceConverter.to(userResource);
        User edit = userService.edit(id, parameter);
        return userResourceConverter.from(edit);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        log.info("[delete] id={}", id);
        userService.delete(id);
    }
}
