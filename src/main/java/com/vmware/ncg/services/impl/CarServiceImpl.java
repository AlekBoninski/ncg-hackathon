package com.vmware.ncg.services.impl;

import com.vmware.ncg.converters.CarConverter;
import com.vmware.ncg.dtos.CarDto;
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
    public void createCar(CarDto car) {
        repository.save(CarConverter.dtoToEntity(car));
    }
}
