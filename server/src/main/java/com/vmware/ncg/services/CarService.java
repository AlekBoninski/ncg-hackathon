package com.vmware.ncg.services;

import com.vmware.ncg.dtos.CarDto;

import java.util.List;

public interface CarService {

    public List<CarDto> getAllCars();

    CarDto getCar(Integer carId);

    void createCar(CarDto car);

    void deleteCar(Integer carId);

    void updateCar(CarDto car, Integer carId);
}
