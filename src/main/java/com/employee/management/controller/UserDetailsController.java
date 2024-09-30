package com.employee.management.controller;

import com.employee.management.dto.UserDetailsDto;
import com.employee.management.service.interfacelist.UserdetailsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserDetailsController {

    private UserdetailsService userdetailsService;

    @Autowired
    public UserDetailsController(UserdetailsService userdetailsService) {
        this.userdetailsService = userdetailsService;
    }

    @PostMapping("/adduser")
    public ResponseEntity<UserDetailsDto> addUsers(@RequestBody @Valid UserDetailsDto user){
        return new ResponseEntity<>(userdetailsService.addUsers(user), HttpStatus.CREATED);

    }
    @GetMapping("/getUser/{id}")
    public ResponseEntity<UserDetailsDto> getUser(@PathVariable Integer id){
        return new ResponseEntity<>(userdetailsService.getuser(id),HttpStatus.FOUND);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<UserDetailsDto>> getAllUsers(){
        return new ResponseEntity<>(userdetailsService.getUsers(),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id){
        return userdetailsService.deteleUser(id);
    }
}
