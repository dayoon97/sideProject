package com.example.sideproject.service.user.database;

import com.example.sideproject.service.user.User;
import com.example.sideproject.support.ObjectConverter;
import org.springframework.stereotype.Component;

/**
 * @author 윤수경 (trrw0531@gmail.com)
 */
@Component
class UserConverter implements ObjectConverter<User, UserEntity> {
    @Override
    public User from(UserEntity userEntity) {
        return User.builder()
                .id(userEntity.getId())
                .name(userEntity.getName())
                .email(userEntity.getEmail())
                .residence(userEntity.getResidence())
                .phone(userEntity.getPhone())
                .createdAt(userEntity.getCreatedAt())
                .updatedAt(userEntity.getUpdatedAt())
                .updater(userEntity.getUpdater())
                .isEnabled(userEntity.isEnabled())
                .build();
    }

    @Override
    public UserEntity to(User user) {
        return new UserEntity(user.getId(),
                user.getName(),
                user.getEmail(),
                user.getResidence(),
                user.getPhone(),
                user.getCreatedAt(),
                user.getUpdatedAt(),
                user.getUpdater(),
                user.isEnabled());
    }
}
