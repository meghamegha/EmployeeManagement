package com.employee.management.exceptionHandling;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
@NoArgsConstructor
@Getter
@Setter
public class ErrorDetails {
    private String errorCode;
    private String message;
    private LocalDateTime timeStamp;
    private String path;

    public ErrorDetails(String message, String errorCode, LocalDateTime timeStamp, String path) {
        this.message = message;
        this.errorCode = errorCode;
        this.timeStamp = timeStamp;
        this.path = path;
    }
}
