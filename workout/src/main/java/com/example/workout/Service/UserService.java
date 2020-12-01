package com.example.workout.Service;

import com.example.workout.Model.User;
import com.example.workout.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Qualifier("userRepository")
    private UserRepository userRepository;

    private UserService (UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public Iterable<User> findAll() {
        return this.userRepository.findAll();
    }

    public Optional<User> findById(int userID) {
        return this.userRepository.findById(userID);

    }

    public void deleteById(int userID) {
        this.userRepository.deleteById(userID);
    }

    public User findByEmailAndPassword(String email, String password) {
        return this.userRepository.findByEmailAndPassword(email, password);
    }
}
