package com.vmware.ncg.controllers;

import com.vmware.ncg.constants.Constants;
import com.vmware.ncg.dtos.CarDto;
import com.vmware.ncg.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    CarService service;

    @RequestMapping(value = Constants.CARS_URL, method = RequestMethod.GET)
    public List<CarDto> getAllCars() {
        return service.getAllCars();
    }

    @RequestMapping(value = Constants.CARS_URL, method = RequestMethod.POST)
    public void createCar(@RequestBody  CarDto car) {
        service.createCar(car);
    }

}
