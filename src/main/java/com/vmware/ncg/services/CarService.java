package com.vmware.ncg.services;

import com.vmware.ncg.dtos.CarDto;

import java.util.List;

public interface CarService {

    public List<CarDto> getAllCars();

    void createCar(CarDto car);
}
