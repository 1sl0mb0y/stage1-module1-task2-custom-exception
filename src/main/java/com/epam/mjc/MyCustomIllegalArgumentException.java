package com.epam.mjc;

public class MyCustomIllegalArgumentException extends IllegalArgumentException {
    public MyCustomIllegalArgumentException(long id) {
        super("Could not find student with ID " + id);
    }
}
