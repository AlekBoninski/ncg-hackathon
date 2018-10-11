package com.vmware.ncg.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Car implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer carId;
    @Column
    private String make;
    @Column
    private String model;
    @Column
    private Boolean available;
    @Column
    private Integer bhp;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getBhp() {
        return bhp;
    }

    public void setBhp(Integer bhp) {
        this.bhp = bhp;
    }
}
