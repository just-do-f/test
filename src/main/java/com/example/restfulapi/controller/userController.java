package com.example.restfulapi.controller;

import com.example.restfulapi.dto.userDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by czl on 2021/8/12 18:22
 */
@RestController
public class userController {
    @GetMapping(value = "/listUser")
    public  List<userDTO> listUser(){
        List<userDTO> listUsers=new ArrayList<>();
        listUsers.add(new userDTO("张三",17));
        listUsers.add(new userDTO("张四",18));
        listUsers.add(new userDTO("张五",19));
        return listUsers;
    }
}
