package org.polytech.covidapi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private VaccinationCenter vaccinationCenter;

    public Doctor(String name, VaccinationCenter vaccinationCenter) {
        this.name = name;
        this.vaccinationCenter = vaccinationCenter;
    }


    public Doctor() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
      public VaccinationCenter getVaccinationCenter() {
      return vaccinationCenter;
      }
      
      public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
      this.vaccinationCenter = vaccinationCenter;
      }
     

}
