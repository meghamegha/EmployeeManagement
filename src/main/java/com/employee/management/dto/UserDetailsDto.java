package com.employee.management.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsDto {
    @NotNull(message = "Cannot be Null")
    private String firstname;
    @NotBlank(message= "Connot be Blank")
    @Size(min=2)
    private String lastname;
    @NotNull
    private Integer age;
    private BigInteger phonenumber;
    @Email(message = "Email entered is not in proper format")
    private String email;
}
