package com.vmware.ncg.services.impl;

import com.vmware.ncg.converters.CarConverter;
import com.vmware.ncg.dtos.CarDto;
import com.vmware.ncg.entities.Car;
import com.vmware.ncg.repositories.CarRepository;
import com.vmware.ncg.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository repository;

    @Override
    public List<CarDto> getAllCars() {
        return repository.findAll().stream().map(CarConverter::entityToDto).collect(Collectors.toList());
    }

    @Override
    public CarDto getCar(Integer carId) {
        return repository.findById(carId).map(CarConverter::entityToDto).get();
    }

    @Override
    public void createCar(CarDto car) {
        repository.save(CarConverter.dtoToEntity(car));
    }

    @Override
    public void deleteCar(Integer carId) {
        repository.deleteById(carId);
    }

    @Override
    public void updateCar(CarDto car, Integer carId) {
        Car c = repository.findById(carId).get();
        if (c != null) {
            c.setMake(car.getMake() == null ? c.getMake() : car.getMake());
            c.setModel(car.getModel() == null ? c.getModel() : car.getModel());
            c.setAvailable(car.isAvailable() == null ? c.getAvailable() : car.isAvailable());
            c.setBhp(car.getBhp() == null ? c.getBhp() : car.getBhp());
            repository.save(c);
        }
    }
}
