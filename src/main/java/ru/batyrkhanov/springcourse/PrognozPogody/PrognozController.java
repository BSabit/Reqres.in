package ru.batyrkhanov.springcourse.PrognozPogody;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.batyrkhanov.springcourse.PrognozPogody.model.Root;


@RestController
@RequestMapping("/prognoz")
public class PrognozController {

    @GetMapping("/astana")
    public Response findAstana() {
    RestTemplate restTemplate = new RestTemplate();

    String url = "http://api.weatherapi.com/v1/current.json?key=c33f9d7ea0ef4ce6b19161711230405&q=ASTANA";

        Root root = restTemplate.getForObject(url, Root.class);


        Response response = new Response(root.getLocation().getCountry(), root.getLocation().getName(),
                root.getLocation().getLocaltime(), root.getCurrent().getTemp_c());


    return response;
}

    @GetMapping("/almaty")
    public Response findAlmaty() {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://api.weatherapi.com/v1/current.json?key=c33f9d7ea0ef4ce6b19161711230405&q=ALMATY&aqi=c33f9d7ea0ef4ce6b19161711230405";

        Root root = restTemplate.getForObject(url, Root.class);


        Response response = new Response(root.getLocation().getCountry(), root.getLocation().getName(),
                root.getLocation().getLocaltime(), root.getCurrent().getTemp_c());


        return response;
    }

    @GetMapping("/aktau")
    public Response findAktau() {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://api.weatherapi.com/v1/current.json?key=c33f9d7ea0ef4ce6b19161711230405&q=AKTAU&aqi=c33f9d7ea0ef4ce6b19161711230405";

        Root root = restTemplate.getForObject(url, Root.class);


        Response response = new Response(root.getLocation().getCountry(), root.getLocation().getName(),
                root.getLocation().getLocaltime(), root.getCurrent().getTemp_c());


        return response;
    }

    @GetMapping("/shymkent")
    public Response findShymkent() {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://api.weatherapi.com/v1/current.json?key=c33f9d7ea0ef4ce6b19161711230405&q=SHYMKENT&aqi=c33f9d7ea0ef4ce6b19161711230405";

        Root root = restTemplate.getForObject(url, Root.class);


        Response response = new Response(root.getLocation().getCountry(), root.getLocation().getName(),
                root.getLocation().getLocaltime(), root.getCurrent().getTemp_c());


        return response;
    }



    @GetMapping("/astana/{id}")
     public Root findAstanaId(@PathVariable("id") int id) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://api.weatherapi.com/v1/forecast.json?key=c33f9d7ea0ef4ce6b19161711230405&q=Astana&days="
                + id + "&aqi=no&alerts=no&aqi=c33f9d7ea0ef4ce6b19161711230405";


        return restTemplate.getForObject(url, Root.class);
        }

    @GetMapping("/almaty/{id}")
    public Root findAlmatyId(@PathVariable("id") int id) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://api.weatherapi.com/v1/forecast.json?key=c33f9d7ea0ef4ce6b19161711230405&q=Almaty&days="
                + id + "&aqi=no&alerts=no&aqi=c33f9d7ea0ef4ce6b19161711230405";


        return restTemplate.getForObject(url, Root.class);
    }

    @GetMapping("/aktau/{id}")
    public Root findAktauId(@PathVariable("id") int id) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://api.weatherapi.com/v1/forecast.json?key=c33f9d7ea0ef4ce6b19161711230405&q=Aktau&days="
                + id + "&aqi=no&alerts=no&aqi=c33f9d7ea0ef4ce6b19161711230405";


        return restTemplate.getForObject(url, Root.class);
    }

    @GetMapping("/shymkent/{id}")
    public Root findShymkentId(@PathVariable("id") int id) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://api.weatherapi.com/v1/forecast.json?key=c33f9d7ea0ef4ce6b19161711230405&q=Shymkent&days="
                + id + "&aqi=no&alerts=no&aqi=c33f9d7ea0ef4ce6b19161711230405";


        return restTemplate.getForObject(url, Root.class);
    }
    }


