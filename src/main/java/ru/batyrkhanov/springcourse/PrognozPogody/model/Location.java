package ru.batyrkhanov.springcourse.PrognozPogody.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("region")
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    String region;

    @JsonProperty("country")
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    String country;

    @JsonProperty("localtime")
    public String getLocaltime() {
        return this.localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    String localtime;
}
