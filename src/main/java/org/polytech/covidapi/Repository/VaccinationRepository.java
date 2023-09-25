package org.polytech.covidapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.polytech.covidapi.Model.Vaccination;

@Repository
public interface VaccinationRepository extends JpaRepository<Vaccination, Long> {

}
