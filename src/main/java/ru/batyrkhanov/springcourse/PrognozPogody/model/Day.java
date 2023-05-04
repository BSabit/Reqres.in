package ru.batyrkhanov.springcourse.PrognozPogody.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Day {
    @JsonProperty("avgtemp_c")
    public double getAvgtemp_c() {
        return this.avgtemp_c;
    }

    public void setAvgtemp_c(double avgtemp_c) {
        this.avgtemp_c = avgtemp_c;
    }

    double avgtemp_c;

}
