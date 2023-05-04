package ru.batyrkhanov.springcourse.PrognozPogody;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import ru.batyrkhanov.springcourse.PrognozPogody.model.Root;

import java.util.List;

@SpringBootApplication
public class PrognozPogodyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrognozPogodyApplication.class, args);
		}
	}


