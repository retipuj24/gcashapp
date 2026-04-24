package com.jupiter;

import com.jupiter.utils.EmailValidator;
import com.jupiter.utils.PhoneValidator;

public class User {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private int pin;
    
    public User() {
    }

    public User(int id, String name, String email, String phoneNumber, int pin) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
    }

    public User(String name, String email, String phoneNumber, int pin) {
        this.id = 0;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = EmailValidator.isValid(name)?name: "notvalid@notvalid.talaga";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = PhoneValidator.validatePhoneNumber(phoneNumber, "+63")?phoneNumber: "630000000000";
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
        result = prime * result + pin;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        } else if (!phoneNumber.equals(other.phoneNumber))
            return false;
        if (pin != other.pin)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", pin="
                + pin + "]";
    }

    
    
}


/**
 * ID
Name
Email
Number
PIN
 */