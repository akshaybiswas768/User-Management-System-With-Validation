package com.Geekster.UserManagementSystemvalid;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class BeanBag {

    @Bean
    public List<User> userList(){
        return new ArrayList<>();
    }
}
