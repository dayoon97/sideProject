package com.example.sideproject.service.user;

import java.time.LocalDateTime;

/**
 * @author 윤수경 (trrw0531@gmail.com)
 */
public class User {
    private String id;
    private final String name;
    private final String email;
    private final String residence;
    private final String phone;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String updater;
    private boolean isEnabled;

    public User(String id, String name, String email, String residence, String phone, LocalDateTime createdAt, LocalDateTime updatedAt, String updater, boolean isEnabled) {
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

    public void setId(String id) {
        this.id = id;
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

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", residence='" + residence + '\'' +
                ", phone='" + phone + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", updater='" + updater + '\'' +
                ", isEnabled=" + isEnabled +
                '}';
    }

    public static class Builder {
        private String id;
        private String name;
        private String email;
        private String residence;
        private String phone;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String updater;
        private boolean isEnabled;

        public Builder id(String id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder residence(String residence) {
            this.residence = residence;
            return this;
        }
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Builder updater(String updater) {
            this.updater = updater;
            return this;
        }
        public Builder isEnabled(boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public User build() {
            return new User(this.id,
                    this.name,
                    this.email,
                    this.residence,
                    this.phone,
                    this.createdAt,
                    this.updatedAt,
                    this.updater,
                    this.isEnabled);
        }
    }
}
