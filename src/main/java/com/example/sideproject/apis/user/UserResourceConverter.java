package com.example.sideproject.apis.user;

import com.example.sideproject.service.user.User;
import com.example.sideproject.support.ObjectConverter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 윤수경 (trrw0531@gmail.com)
 */
@Component
public class UserResourceConverter implements ObjectConverter<UserResource, User> {
    private final DateTimeFormatter dateTimeFormatter;

    public UserResourceConverter(DateTimeFormatter dateTimeFormatter) {
        this.dateTimeFormatter = dateTimeFormatter;
    }

    @Override
    public UserResource from(User user) {
        return new UserResource(user.getId(),
                user.getName(),
                user.getEmail(),
                user.getResidence(),
                user.getPhone(),
                user.getCreatedAt() != null ? user.getCreatedAt().format(dateTimeFormatter) : null,
                user.getUpdatedAt() != null ? user.getUpdatedAt().format(dateTimeFormatter) : null,
                user.getUpdater(),
                user.isEnabled());
    }

    @Override
    public User to(UserResource userResource) {
        return User.builder().id(userResource.getId())
                .name(userResource.getName())
                .email(userResource.getEmail())
                .residence(userResource.getResidence())
                .phone(userResource.getPhone())
                .createdAt(userResource.getCreatedAt() != null ? LocalDateTime.parse(userResource.getCreatedAt()) : null)
                .updatedAt(userResource.getUpdatedAt() != null ? LocalDateTime.parse(userResource.getUpdatedAt()) : null)
                .updater(userResource.getUpdater())
                .isEnabled(userResource.isEnabled())
                .build();
    }
}
