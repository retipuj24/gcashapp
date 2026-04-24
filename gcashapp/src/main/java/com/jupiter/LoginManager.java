package com.jupiter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LoginManager {

    
    public static User login(List<User> userList, String mobileNumber, int pin) {
        Predicate<User> userPredicate = u -> 
            u.getPhoneNumber().equals(mobileNumber) && u.getPin() == pin;

        return userList.stream().filter(userPredicate)
            .findFirst()
            .orElse(null);
    }

    public static void main(String[] args) {
        List<User> uList = new ArrayList<>();
        uList.add(new User(0, "Jupiter Capili", "jncapili@gmail.com", "+639913276316", 123456));
        uList.add(new User(0, "Diego Bandido", "diego@gmail.com", "+639912345670", 123456));
        uList.add(new User(0, "Bruno Caballero", "akoaybulaklak@gmail.com", "+639910002233", 123456));
        uList.add(new User(0, "Althea Deogracias", "althea@gmail.com", "+63992345678", 123456));
        uList.add(new User(0, "Donald Trampolol", "donaldtrampolol@gmail.com", "+639919897625", 123456));
        uList.add(new User(0, "Haring Pater", "hagwarts@gmail.com", "+639912348596", 123456));
        uList.add(new User(0, "Alice Valik", "alissya@gmail.com", "+639913256541", 123456));
        uList.add(new User(0, "John Doe", "johndoe@gmail.com", "+639910002125", 123456));
        uList.add(new User(0, "Maritess Mahinhinan", "mmahinhinan@gmail.com", "+639912553678", 123456));
    

        String mobileNumber = "+639913276316";
        int pin = 123456;
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        User user = login(uList, mobileNumber, pin);
        if (user != null) {
            System.out.println("Login successful! User: " + user.getName());
        } else {
            System.out.println("Invalid credentials.");
        }
    }

}
