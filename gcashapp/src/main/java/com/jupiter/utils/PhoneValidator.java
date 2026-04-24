package com.jupiter.utils;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

public class PhoneValidator {
    public static boolean validatePhoneNumber(String number, String countryCode) {
    PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        try {
            PhoneNumber parsedNumber = phoneUtil.parse(number, countryCode);
            return phoneUtil.isValidNumber(parsedNumber); // Validates number + country [7]
        } catch (Exception e) {
            return false;
        }
    }
}
