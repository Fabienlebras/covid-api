package org.polytech.covidapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import org.polytech.covidapi.Model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {


}
