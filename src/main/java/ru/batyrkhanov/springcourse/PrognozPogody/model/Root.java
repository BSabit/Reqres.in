package ru.batyrkhanov.springcourse.PrognozPogody.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
    @JsonProperty("location")
    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    Location location;

    @JsonProperty("current")
    public Current getCurrent() {
        return this.current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    Current current;

    @JsonProperty("forecast")
    public Forecast getForecast() {
        return this.forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    Forecast forecast;
}
