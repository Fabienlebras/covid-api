package org.polytech.covidapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.polytech.covidapi.Model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
