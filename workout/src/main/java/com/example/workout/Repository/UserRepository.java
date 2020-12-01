package com.example.workout.Repository;

import com.example.workout.Model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {

    Iterable<User> findAll();

    Optional<User> findById(int userID);

    void deleteById(int userID);

    User findByEmailAndPassword(String email, String password);

}
