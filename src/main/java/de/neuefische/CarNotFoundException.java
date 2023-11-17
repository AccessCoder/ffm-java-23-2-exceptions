package de.neuefische;

public class CarNotFoundException extends Exception{

    public CarNotFoundException(String message) {
        super(message);
    }

    public CarNotFoundException() {
    }
}
