package ru.batyrkhanov.springcourse.PrognozPogody.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Forecast {
    @JsonProperty("forecastday")
    public ArrayList<Forecastday> getForecastday() {
        return this.forecastday;
    }

    public void setForecastday(ArrayList<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }

    ArrayList<Forecastday> forecastday;
}
