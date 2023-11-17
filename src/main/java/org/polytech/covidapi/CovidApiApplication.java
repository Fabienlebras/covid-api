package org.polytech.covidapi;

import org.polytech.covidapi.Model.VaccinationCenter;
import org.polytech.covidapi.Service.VaccinationCenterService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CovidApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CovidApiApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(VaccinationCenterService vaccinationCenterService) {
        return args -> {
            // VaccinationCenter vaccinationCenter = new VaccinationCenter("Nom du centre",
            // "Adresse du centre", "Nancy");
            // vaccinationCenterService.save(vaccinationCenter);
        };
    }
}