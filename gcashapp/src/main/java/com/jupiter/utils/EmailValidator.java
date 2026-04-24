package com.jupiter.utils;

import java.util.regex.Pattern;

public class EmailValidator {
    private static final String REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + 
                                       "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public static boolean isValid(String email) {
        return Pattern.compile(REGEX)
                      .matcher(email)
                      .matches();
    }
}