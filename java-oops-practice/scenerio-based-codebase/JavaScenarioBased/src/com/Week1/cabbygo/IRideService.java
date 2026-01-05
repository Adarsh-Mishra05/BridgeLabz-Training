package com.Week1.cabbygo;

public interface IRideService {
    void bookRide(Vehicle vehicle, Driver driver, double distance);
    void endRide();
}