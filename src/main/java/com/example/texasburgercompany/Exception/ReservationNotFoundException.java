package com.example.texasburgercompany.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class ReservationNotFoundException extends RuntimeException{

    public ReservationNotFoundException(String message)
    {
        super(message);
    }
}