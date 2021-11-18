package com.example.sideproject.service.user.database;

import com.example.sideproject.service.user.User;
import com.example.sideproject.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author 윤수경 (trrw0531@gmail.com)
 */
@Service
public class UserDatabaseService implements UserService {
    private final UserConverter userConverter;
    private final UserRepository userRepository;
    private final Logger log;

    public UserDatabaseService(UserConverter userConverter, UserRepository userRepository) {
        this.userConverter = userConverter;
        this.userRepository = userRepository;
        this.log = LoggerFactory.getLogger(this.getClass());
    }

    @Override
    public User save(User user) {
        log.debug("[save] user={}", user);
        UserEntity parameter = userConverter.to(user);
        UserEntity save = userRepository.save(parameter);
        return userConverter.from(save);
    }

    @Override
    public Optional<User> get(String id) {
        log.debug("[get] id={}", id);
        return userRepository.findById(id)
                .map(userConverter::from);
    }

    @Override
    public List<User> get() {
        log.debug("[get]");
        return userRepository.findAll()
                .stream().map(userConverter::from)
                .collect(Collectors.toCollection(LinkedList::new));
    }

    @Override
    public User edit(String id, User user) {
        log.debug("[edit] id={}, user={}", id, user);
        return userRepository.findById(id)
                .map(userEntity -> {
                    user.setId(id);
                    UserEntity parameter = userConverter.to(user);
                    UserEntity edit = userRepository.save(parameter);
                    return userConverter.from(edit);
                }).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public void delete(String id) {
        log.debug("[delete] id={}", id);
        userRepository.deleteById(id);
    }
}
