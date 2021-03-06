package edu.hm.cs.iua.exceptions.registration;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidDataException extends RegistrationException {

    public InvalidDataException(String message) {
        super(message);
    }

}