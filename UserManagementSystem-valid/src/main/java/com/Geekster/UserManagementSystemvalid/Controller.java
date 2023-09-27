package com.Geekster.UserManagementSystemvalid;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Controller {
    @Autowired
    List<User> userList;

    @PostMapping("user")
    public String addUsers(@RequestBody @Valid List<User>user){
        userList.addAll(user);
        return "users added";
    }

    @GetMapping("users")
    public List<User> getAllUser(){
        return userList;
    }

    @PutMapping("user/{id}")
    public String updateUser(@PathVariable Integer id, @RequestParam String name){
        for(User user : userList){
            if (user.getUserId().equals(id)){
                user.setUserName(name);
                return "user updated";
            }
        }
        return "Invalid User ID";
    }
    @DeleteMapping("user/{id}")
    public  String deleteUser(@PathVariable Integer id){
        for(User user : userList){
            if(user.getUserId().equals(id)){
                userList.remove(user);
                return "user removed";
            }
        }
        return "Invalid User ID";
    }

}
