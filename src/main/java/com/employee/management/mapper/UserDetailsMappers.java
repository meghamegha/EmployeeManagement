package com.employee.management.mapper;

import com.employee.management.dto.UserDetailsDto;
import com.employee.management.entity.UserDetails;

public class UserDetailsMappers {
    public UserDetailsDto mapToDto(UserDetails user){
        UserDetailsDto userDetailsDto = new UserDetailsDto();
        userDetailsDto.setFirstname(user.getFirstname());
        userDetailsDto.setLastname(user.getLastname());
        userDetailsDto.setAge(user.getAge());
        userDetailsDto.setEmail(user.getEmail());
        userDetailsDto.setPhonenumber(user.getPhonenumber());
        return userDetailsDto;
    }

    public UserDetails mapToDao(UserDetailsDto user){
        UserDetails userDetails = new UserDetails();
        userDetails.setFirstname(user.getFirstname());
        userDetails.setLastname(user.getLastname());
        userDetails.setAge(user.getAge());
        userDetails.setEmail(user.getEmail());
        userDetails.setPhonenumber(user.getPhonenumber());
        return userDetails;
    }
}
