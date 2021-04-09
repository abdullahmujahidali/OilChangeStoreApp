package com.wtechweb.oilservice;
public class Car {
    String ownerName;
    String ownerCar;
    String carNumber;
    String address;
    String workerName;
    String phoneNumber;
    String lastReading;
    public Car(){

    }
    public Car(String ownerName, String ownerCar, String carNumber,  String name, String work, String lastRead) {
        this.ownerName = ownerName;
        this.ownerCar = ownerCar;
        this.carNumber = carNumber;
        this.address = name;
        this.workerName=work;
        this.lastReading=lastRead;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerCar() {
        return ownerCar;
    }

    public void setOwnerCar(String ownerCar) {
        this.ownerCar = ownerCar;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String name) {
        this.address = name;
    }

    public String getWorker() {
        return workerName;
    }

    public void setWorker(String worker) {
        this.workerName = worker;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastReading() {
        return lastReading;
    }

    public void setLastReading(String lastReading) {
        this.lastReading = lastReading;
    }
}
