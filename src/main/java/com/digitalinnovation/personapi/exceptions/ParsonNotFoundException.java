package com.digitalinnovation.personapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ParsonNotFoundException extends Exception {
    public ParsonNotFoundException(Long id) {
        super("Person not found with ID: " + id);
    }
}
