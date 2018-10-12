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

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.GET)
    public List<CarDto> getAllCars() {
        return service.getAllCars();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = Constants.INSTANCE_PATH, method = RequestMethod.GET)
    public CarDto getCar(@PathVariable Integer id) {
        return service.getCar(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.POST)
    public void createCar(@RequestBody  CarDto car) {
        service.createCar(car);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = Constants.INSTANCE_PATH, method = RequestMethod.DELETE)
    public void deleteCar(@PathVariable Integer id){
        service.deleteCar(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = Constants.INSTANCE_PATH, method = RequestMethod.PATCH)
    public void updateCar(@RequestBody CarDto car, @PathVariable Integer id) {
        service.updateCar(car, id);
    }

}
