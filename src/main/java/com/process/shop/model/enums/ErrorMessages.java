package com.process.shop.model.enums;

import lombok.Getter;

@Getter
public enum ErrorMessages {
    USER_NOT_FOUND("User not found!"),
    USER_EMAIL_EXISTS("The email is already registered");

    private final String message;

    ErrorMessages(String message) {
        this.message = message;
    }
}
