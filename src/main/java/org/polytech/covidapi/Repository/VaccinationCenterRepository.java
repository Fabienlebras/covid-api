package org.polytech.covidapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.polytech.covidapi.Model.VaccinationCenter;

@Repository
public interface VaccinationCenterRepository extends JpaRepository<VaccinationCenter, Long> {

    List<VaccinationCenter> findAllByCityLike(String name);
    
    boolean existsById(Long id);


}
