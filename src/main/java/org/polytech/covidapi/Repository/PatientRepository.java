package org.polytech.covidapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.polytech.covidapi.Model.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{

}
