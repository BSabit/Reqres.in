package ru.batyrkhanov.springcourse.FirstProxy.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DoobleOne {
    Datum data;

    @JsonProperty("data")
    public Datum getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Datum data) {
        this.data = data;
    }

    Support support;

    @JsonProperty("support")
    public Support getSupport() {
        return support;
    }

    @JsonProperty("support")
    public void setSupport(Support support) {
        this.support = support;
    }
}
