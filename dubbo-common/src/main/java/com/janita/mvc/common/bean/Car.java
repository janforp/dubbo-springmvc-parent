package com.janita.mvc.common.bean;

import java.io.Serializable;

/**
 * Created by Janita on 2017-04-02 13:42
 */
public class Car implements Serializable {

    private Long carId;

    private String carName;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                '}';
    }
}
