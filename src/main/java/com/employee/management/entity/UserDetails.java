package com.employee.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigInteger;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
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
    @CreationTimestamp
    private Date createdDate;
    @UpdateTimestamp
    private Date lastModified;
}
