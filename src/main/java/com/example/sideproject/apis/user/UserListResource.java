package com.example.sideproject.apis.user;

import com.example.sideproject.service.user.User;

import java.util.List;

/**
 * @author 윤수경 (trrw0531@gmail.com)
 */
public class UserListResource {
    private List<UserResource> content;
    private int count;

    public UserListResource(List<UserResource> content) {
        this.content = content;
        this.count = content.size();
    }

    public List<UserResource> getContent() {
        return content;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "UserListResource{" +
                "content=" + content +
                ", count=" + count +
                '}';
    }
}
