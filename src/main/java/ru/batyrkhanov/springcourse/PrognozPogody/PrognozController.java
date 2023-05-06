package ru.batyrkhanov.springcourse.PrognozPogody;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.batyrkhanov.springcourse.PrognozPogody.model.Root;

import java.util.Locale;


@RestController
@RequestMapping("/prognoz")
public class PrognozController {
    @GetMapping("/{city}")
    public Response findCity(@PathVariable("city") String city) {
        RestTemplate restTemplate = new RestTemplate();
        Root root = restTemplate.getForObject("http://api.weatherapi.com/v1/current.json?key=c33f9d7ea0ef4ce6b19161711230405&q="
                + city.toUpperCase(), Root.class);
        assert root != null;
        return new Response(root.getLocation().getCountry(), root.getLocation().getName(),
                root.getLocation().getLocaltime(), root.getCurrent().getTemp_c());
    }

    @GetMapping("/{city}/{id}")
     public Root findCityById(@PathVariable("city") String city, @PathVariable("id") int id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.weatherapi.com/v1/forecast.json?key=c33f9d7ea0ef4ce6b19161711230405&q="
                + city.toUpperCase() + "&days=" + id, Root.class);
        }
    }


