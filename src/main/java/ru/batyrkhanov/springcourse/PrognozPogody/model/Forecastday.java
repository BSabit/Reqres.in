package ru.batyrkhanov.springcourse.PrognozPogody.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Forecastday {
    @JsonProperty("date")
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    String date;

    @JsonProperty("day")
    public Day getDay() {
        return this.day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    Day day;

}
