package de.neuefische;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CarRepo {

    List<Car> cars = new ArrayList<>();

    public List<Car> getALlCars(){
        return cars;
    }

    public Car getCarById(String id) throws CarNotFoundException {
        return cars.stream()
                .filter(car -> car.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new CarNotFoundException("no Car, with ID:" + id + " found!"));
    }

    public double calcInsurance(int years) throws ArithmeticException{
        if (years == 0){
            throw new ArithmeticException("InsuranceYears could not be 0");
        }
        return years+1*5.8;
    }

    public void addCar(Car car){
        cars.add(car);
    }
}
