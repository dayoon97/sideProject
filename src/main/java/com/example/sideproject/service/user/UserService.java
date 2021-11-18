package com.example.sideproject.service.user;

import java.util.List;
import java.util.Optional;

/**
 * @author 윤수경 (trrw0531@gmail.com)
 */
public interface UserService {
    User save(User user);

    Optional<User> get(String id);

    List<User> get();

    User edit(String id, User user);

    void delete(String id);
}
