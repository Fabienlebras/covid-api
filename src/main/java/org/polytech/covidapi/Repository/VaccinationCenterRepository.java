package org.polytech.covidapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.polytech.covidapi.Model.VaccinationCenter;


@Repository
public interface VaccinationCenterRepository extends JpaRepository<VaccinationCenter,Long>{

}
