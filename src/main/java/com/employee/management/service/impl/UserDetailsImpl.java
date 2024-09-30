package com.employee.management.service.impl;

import com.employee.management.dto.UserDetailsDto;
import com.employee.management.entity.UserDetails;
import com.employee.management.exceptionHandling.NotFoundException;
import com.employee.management.mapper.UserDetailsMappers;
import com.employee.management.repository.UserDetailsRepo;
import com.employee.management.service.interfacelist.UserdetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class UserDetailsImpl implements UserdetailsService {

    private UserDetailsRepo userDetailsRepo;
    @Autowired
    public UserDetailsImpl(UserDetailsRepo userDetailsRepo) {
        this.userDetailsRepo = userDetailsRepo;
    }

    UserDetailsMappers mappers= new UserDetailsMappers();

    @Override
    public UserDetailsDto addUsers(UserDetailsDto user) {
        UserDetails userDetails = mappers.mapToDao(user);
        UserDetails usersaved = userDetailsRepo.save(userDetails);
        return mappers.mapToDto(usersaved);
    }

    @Override
    public List<UserDetailsDto> getUsers() {
        List<UserDetails>listusers=userDetailsRepo.findAll();
        listusers.stream().map((user)->mappers.mapToDto(user)).toList();
        return listusers.stream().map((user)->mappers.mapToDto(user)).toList();
    }

    @Override
    public UserDetailsDto getuser(Integer id) {
        Optional<UserDetails> user = userDetailsRepo.findById(id);
        if(user.isEmpty())
            throw new NotFoundException("User not found");
        UserDetailsDto userDetailsDto = mappers.mapToDto(user.get());
        return userDetailsDto;
    }

    @Override
    public String deteleUser(Integer id) {
        Optional<UserDetails> user=userDetailsRepo.findById(id);
        if(user.isEmpty())
             throw new NotFoundException("User not found");
        else {
            userDetailsRepo.deleteById(id);
        }
        return "User deleted";
    }
}
