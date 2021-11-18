package com.example.sideproject.service.user.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 윤수경 (trrw0531@gmail.com)
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
}
