package ru.batyrkhanov.springcourse.FirstProxy.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Root {
    int page;
    int per_page;
    int total;
    int total_pages;
    ArrayList<Datum> data;
    Support support;
}
