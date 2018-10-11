package com.vmware.ncg.dtos;

public class CarDto {

    private Integer id;
    private String make;
    private String model;
    private int bhp;

    public CarDto(Integer id, String make, String model, int bhp) {
        this.id = id;
        this.make = make;
        this.model = model;
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

    public int getBhp() {
        return bhp;
    }

    public void setBhp(int bhp) {
        this.bhp = bhp;
    }
}
