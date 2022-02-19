package com.softtech.softtechspringboot.dor.gen.exceptions;

import com.softtech.softtechspringboot.dor.gen.enums.BaseErrorMessage;
import com.softtech.softtechspringboot.dor.gen.enums.GenErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(BaseErrorMessage message) {
        super(message.getMessage());
    }
}
