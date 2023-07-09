package com.amatta.task.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserActivity {
    ENABLE("USER_ENABLE", "사용자 활성화"),
    DISABLE("USER_DISABLE", "사용자 비활성화");

    private final String key;
    private final String displayedName;
}
