package org.polytech.covidapi.Repository;

import org.polytech.covidapi.Model.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;



public interface VaccinationCenterRepository 

    extends JpaRepository<VaccinationCenter, Integer> {



    }
    
