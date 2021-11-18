package com.example.sideproject.service.user.database;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author 윤수경 (trrw0531@gmail.com)
 */
@Entity(name = "woman")
class UserEntity {
    @Id
    private String id;
    private String name;
    private String email;
    private String residence;
    private String phone;
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    private String updater;
    @Column(name = "is_enabled")
    private boolean isEnabled;

    public UserEntity(String id, String name, String email, String residence, String phone, LocalDateTime createdAt, LocalDateTime updatedAt, String updater, boolean isEnabled) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.residence = residence;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.updater = updater;
        this.isEnabled = isEnabled;
    }

    public UserEntity() {

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getResidence() {
        return residence;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getUpdater() {
        return updater;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
