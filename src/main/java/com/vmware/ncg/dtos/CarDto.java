package com.vmware.ncg.dtos;

public class CarDto {

    private Integer id;
    private String make;
    private String model;
    private Boolean available;
    private Integer bhp;

    public CarDto() {}

    public CarDto(Integer id, String make, String model, Integer bhp) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.available = Boolean.TRUE;
        this.bhp = bhp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean isAvailable() {
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
