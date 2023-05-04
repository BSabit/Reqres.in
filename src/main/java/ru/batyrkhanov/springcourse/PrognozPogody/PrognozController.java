package ru.batyrkhanov.springcourse.PrognozPogody;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.batyrkhanov.springcourse.PrognozPogody.model.Root;


@RestController
@RequestMapping("/prognoz")
public class PrognozController {

    @GetMapping("/{city}")
    public Response findAstana(@PathVariable("city") String city) {
        return RestTemp(city);
    }

    @GetMapping("/{city}/{id}")
     public Root findAstanaId(@PathVariable("city") String city, @PathVariable("id") int id) {
        return RestTemp2(city, id);
        }


    public Response RestTemp(String http) {
        RestTemplate restTemplate = new RestTemplate();
        switch (http) {
            case "astana" -> http = "ASTANA";
            case "almaty" -> http = "ALMATY";
            case "aktau" -> http = "AKTAU";
            case "shymkent" -> http = "SHYMKENT";
            default -> http = "SEMEI";
        }
        Root root = restTemplate.getForObject("http://api.weatherapi.com/v1/current.json?key=c33f9d7ea0ef4ce6b19161711230405&q="
                + http, Root.class);
        assert root != null;
        return new Response(root.getLocation().getCountry(), root.getLocation().getName(),
                root.getLocation().getLocaltime(), root.getCurrent().getTemp_c());
    }

    public Root RestTemp2(String http, int id) {
        RestTemplate restTemplate = new RestTemplate();
        switch (http) {
            case "astana" -> http = "ASTANA";
            case "almaty" -> http = "ALMATY";
            case "aktau" -> http = "AKTAU";
            case "shymkent" -> http = "SHYMKENT";
            default -> http = "SEMEI";
        }
        return restTemplate.getForObject("http://api.weatherapi.com/v1/forecast.json?key=c33f9d7ea0ef4ce6b19161711230405&q=Astana&days="
                + id, Root.class);
    }
    }


