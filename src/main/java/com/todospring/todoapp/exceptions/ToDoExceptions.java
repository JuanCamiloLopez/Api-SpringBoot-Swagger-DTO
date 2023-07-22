package com.todospring.todoapp.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public class ToDoExceptions extends RuntimeException  {

    private String message;
    private HttpStatus httpStatus;

    public ToDoExceptions(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
