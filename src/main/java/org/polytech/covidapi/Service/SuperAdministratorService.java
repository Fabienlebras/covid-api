package org.polytech.covidapi.Service;

import org.polytech.covidapi.Model.SuperAdministrator;
import org.polytech.covidapi.Repository.SuperAdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperAdministratorService {

    @Autowired
    private SuperAdministratorRepository superAdministratorRepository;

    public Iterable<SuperAdministrator> getVaccination() {
        return superAdministratorRepository.findAll();
    }

    public void save(SuperAdministrator superAdministrator) {
        superAdministratorRepository.save(superAdministrator);

    }

    public void delete(long id) {
        superAdministratorRepository.deleteById(id);
    }

    public void update(SuperAdministrator superAdministrator) {

        if (superAdministratorRepository.existsById(superAdministrator.getId())) {
            superAdministratorRepository.save(superAdministrator);
        }

    }

}
