package com.amatta.task.domain;

import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User {
    @Id
    private Long id;
    private String email; // TODO: 이후 OAuth를 위해 value Object로 구현?
    private String name;
    private String password;
    private Role role;
    private UserActivity userActivity;
    public User createCommonUser(String email, String name, String password) {
        return new User(null, email, name, password, Role.USER, UserActivity.ENABLE);
    }

    public User changePassword(String password){
        // TODO: Somehintg Password Policy
        this.password = password;
        return this;
    }

    public User disableUser(User user) {
        user.userActivity = UserActivity.DISABLE;
        return user;
    }
}
