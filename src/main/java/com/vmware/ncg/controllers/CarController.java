package com.vmware.ncg.controllers;

import com.vmware.ncg.constants.Constants;
import com.vmware.ncg.dtos.CarDto;
import com.vmware.ncg.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constants.CARS_URL)
public class CarController {

    @Autowired
    CarService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<CarDto> getAllCars() {
        return service.getAllCars();
    }

    @RequestMapping(value = Constants.INSTANCE_PATH, method = RequestMethod.GET)
    public CarDto getCar(@PathVariable Integer id) {
        return service.getCar(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createCar(@RequestBody  CarDto car) {
        service.createCar(car);
    }

    @RequestMapping(value = Constants.INSTANCE_PATH, method = RequestMethod.DELETE)
    public void deleteCar(@PathVariable Integer id){
        service.deleteCar(id);
    }

    @RequestMapping(value = Constants.INSTANCE_PATH, method = RequestMethod.PATCH)
    public void updateCar(@RequestBody CarDto car, @PathVariable Integer id) {
        service.updateCar(car, id);
    }

}
