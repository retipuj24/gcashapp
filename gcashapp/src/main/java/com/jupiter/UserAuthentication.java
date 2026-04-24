package com.jupiter;

public class UserAuthentication {
    public void registration(String name, String email, String phonenUmber, int pinCode){
        User user = new User(name, email, phonenUmber,pinCode);
    }


    public void changePin(){

    }
    
    public void logout(){

    }
    
}


/**
 * // table for mariadb;
 * 
 * CREATE TABLE ciicc2026.NewTable (
	id INT auto_increment NULL,
	name varchar(100) NULL,
	email varchar(100) NULL,
	ph_number varchar(100) NULL,
	pin INT NULL
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;
 */