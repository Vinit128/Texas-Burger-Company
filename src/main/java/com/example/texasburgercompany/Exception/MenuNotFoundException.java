package com.example.texasburgercompany.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class MenuNotFoundException extends RuntimeException{

    public MenuNotFoundException(String message)
    {
        super(message);
    }
}