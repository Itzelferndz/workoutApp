package com.example.workout.Repository;

import com.example.workout.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findAll();

    Optional<User> findById(int userID);

    void deleteById(int userID);

    User findByEmailAndPassword(String email, String password);

}
