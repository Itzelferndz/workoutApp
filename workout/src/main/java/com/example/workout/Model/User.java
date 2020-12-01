package com.example.workout.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="users")
public class User {

    @Column(name ="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    public User() {
    }

    public User(String email, String password){
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int userID) {
        this.id = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
