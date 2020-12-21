package com.epita.tpalimentation.exceptions;

public class NotFoundException extends Exception {
    public NotFoundException(String s) {
        super(s);
    }

    public NotFoundException() {
        super();
    }
}
