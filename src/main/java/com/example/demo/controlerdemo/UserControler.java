package com.example.demo.controlerdemo;

import com.example.demo.repositorydemo.UserRepository;
import com.example.demo.entitydemo.User;
import com.example.demo.daoModel.AddUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/demo")

public class UserControler {
    private UserRepository userRepository;

    @Autowired
    public UserControler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUsers() {

        return userRepository.findAll();

    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody AddUserRequest addUserRequest) {
        User user = new User();
        user.setFirstName(addUserRequest.getName());
        user.setLastName(addUserRequest.getSurname());
        userRepository.save(user);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
}