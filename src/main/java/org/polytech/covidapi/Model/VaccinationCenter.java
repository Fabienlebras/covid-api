package org.polytech.covidapi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vaccination Center")
public class VaccinationCenter {

    @Id
    private Integer id;
    private String name;
    private String address;
    private String city;

    public Integer getId() {
        return id;
    }

}