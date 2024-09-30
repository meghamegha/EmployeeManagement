package com.employee.management.service.interfacelist;

import com.employee.management.dto.UserDetailsDto;
import com.employee.management.entity.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserdetailsService {
    public UserDetailsDto addUsers(UserDetailsDto user);
    public List<UserDetailsDto> getUsers();
    public UserDetailsDto getuser(Integer id);
    public String deteleUser(Integer id);
}
