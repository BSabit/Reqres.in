package ru.batyrkhanov.springcourse.PrognozPogody;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.batyrkhanov.springcourse.PrognozPogody.model.Root;


@RestController
@RequestMapping("/prognoz")
public class PrognozController {

    @GetMapping("/astana")
    public Response findAstana() {
        return RestTemp("http://api.weatherapi.com/v1/current.json?key=c33f9d7ea0ef4ce6b19161711230405&q=ASTANA");
    }


    @GetMapping("/almaty")
    public Response findAlmaty() {
       return RestTemp("http://api.weatherapi.com/v1/current.json?key=c33f9d7ea0ef4ce6b19161711230405&q=ALMATY");
    }

    @GetMapping("/aktau")
    public Response findAktau() {
       return RestTemp("http://api.weatherapi.com/v1/current.json?key=c33f9d7ea0ef4ce6b19161711230405&q=AKTAU");
    }

    @GetMapping("/shymkent")
    public Response findShymkent() {
        return RestTemp("http://api.weatherapi.com/v1/current.json?key=c33f9d7ea0ef4ce6b19161711230405&q=SHYMKENT");
    }



    @GetMapping("/astana/{id}")
     public Root findAstanaId(@PathVariable("id") int id) {
        return RestTemp2("http://api.weatherapi.com/v1/forecast.json?key=c33f9d7ea0ef4ce6b19161711230405&q=Astana&days=" + id);
        }

    @GetMapping("/almaty/{id}")
    public Root findAlmatyId(@PathVariable("id") int id) {
        return RestTemp2("http://api.weatherapi.com/v1/forecast.json?key=c33f9d7ea0ef4ce6b19161711230405&q=Almaty&days=" + id);
    }

    @GetMapping("/aktau/{id}")
    public Root findAktauId(@PathVariable("id") int id) {
        return RestTemp2("http://api.weatherapi.com/v1/forecast.json?key=c33f9d7ea0ef4ce6b19161711230405&q=Aktau&days=" + id);
    }

    @GetMapping("/shymkent/{id}")
    public Root findShymkentId(@PathVariable("id") int id) {
        return RestTemp2("http://api.weatherapi.com/v1/forecast.json?key=c33f9d7ea0ef4ce6b19161711230405&q=Shymkent&days=" + id);
    }


    public Response RestTemp(String http) {
        RestTemplate restTemplate = new RestTemplate();
        Root root = restTemplate.getForObject(http, Root.class);
        assert root != null;
        return new Response(root.getLocation().getCountry(), root.getLocation().getName(),
                root.getLocation().getLocaltime(), root.getCurrent().getTemp_c());
    }

    public Root RestTemp2(String http) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(http, Root.class);
    }
    }


