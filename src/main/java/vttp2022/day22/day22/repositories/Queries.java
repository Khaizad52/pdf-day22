package vttp2022.day22.day22.repositories;

public class Queries {

    public static final String SQL_INSERT_USER= "insert into user(username, password, email, phone, dob) values(?, sha(?), ?, ?, ?";
}
