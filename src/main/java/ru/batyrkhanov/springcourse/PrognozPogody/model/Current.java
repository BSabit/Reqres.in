package ru.batyrkhanov.springcourse.PrognozPogody.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current {
    @JsonProperty("last_updated")
    public String getLast_updated() {
        return this.last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    String last_updated;

    @JsonProperty("temp_c")
    public double getTemp_c() {
        return this.temp_c;
    }

    public void setTemp_c(double temp_c) {
        this.temp_c = temp_c;
    }

    double temp_c;


}
