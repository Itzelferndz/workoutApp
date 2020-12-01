package com.example.workout.Controller;

import com.example.workout.Service.UserService;
import org.springframework.web.bind.annotation.*;
import com.example.workout.Model.User;


import java.util.Optional;


@RequestMapping("/user")
@RestController
@CrossOrigin(origins = "*", allowedHeaders="*")
public class UserController {
    private UserService userService;

    public UserController(){

    }


    //used to return all users
    @GetMapping("")
    public Iterable<User> getAllUser(){
        return userService.findAll();
    }
    {/*
    //finds user by id returns null if not found
    @GetMapping("/{id}")
    public Optional<User>getUserById(@PathVariable(value ="id") int userID){
        return userService.findById(userID);
    }

    //removing users
    //returns 0 if successful and -1 if no user was found
    @PostMapping("/remove/{id}")
    public int removeUser(@PathVariable(value="id") int userID){
        Optional<User> temp = userService.findById(userID);

        if(!temp.isPresent()){ return -1; }
        userService.deleteById(userID);
        return 0;
    }

    //adding users
    //Returns UserID
    @PostMapping("/add/{email}/{password}")
    public boolean checkLogin(@PathVariable (value="email") String email, @PathVariable(value= "password") String password){
        User tempUser= userService.findByEmailAndPassword(email, password);

        if(tempUser==null){
            return false;
        }
        return true;
    }
    */}
}
