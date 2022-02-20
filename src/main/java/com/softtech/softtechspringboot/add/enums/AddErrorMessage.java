package com.softtech.softtechspringboot.add.enums;

import com.softtech.softtechspringboot.gen.enums.BaseErrorMessage;

public enum AddErrorMessage implements BaseErrorMessage {

    ADDRESS_ERROR_MESSAGE("Address not found!")
    ;

    private String message;

    AddErrorMessage(String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
