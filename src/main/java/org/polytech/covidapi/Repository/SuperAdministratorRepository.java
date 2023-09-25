package org.polytech.covidapi.Repository;

import org.polytech.covidapi.Model.SuperAdministrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperAdministratorRepository extends JpaRepository<SuperAdministrator, Long> {

}
