package ru.batyrkhanov.springcourse.FirstProxy.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.batyrkhanov.springcourse.FirstProxy.models.DoobleOne;
import ru.batyrkhanov.springcourse.FirstProxy.models.Root;


@RestController
@RequestMapping("/people")
public class PeopleController {


    @GetMapping
    public Root findAll() {
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://reqres.in//api/users?page=2";



        return restTemplate.getForObject(url, Root.class);
    }

    @GetMapping("/{id}")
    public DoobleOne findOne(@PathVariable("id")int id) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://reqres.in//api/users/2";

        return restTemplate.getForObject(url, DoobleOne.class);
    }


}
