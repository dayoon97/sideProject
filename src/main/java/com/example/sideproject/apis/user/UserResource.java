package com.example.sideproject.apis.user;

/**
 * @author 윤수경 (trrw0531@gmail.com)
 */
public class UserResource {
    private final String id;
    private final String name;
    private final String email;
    private final String residence;
    private final String phone;
    private String createdAt;
    private String updatedAt;
    private String updater;
    private boolean isEnabled;

    public UserResource(String id, String name, String email, String residence, String phone, String createdAt, String updatedAt, String updater, boolean isEnabled) {
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

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getResidence() {
        return residence;
    }

    public String getPhone() {
        return phone;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getUpdater() {
        return updater;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public String toString() {
        return "UserResource{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", residence='" + residence + '\'' +
                ", phone='" + phone + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", updater='" + updater + '\'' +
                ", isEnabled=" + isEnabled +
                '}';
    }
}
