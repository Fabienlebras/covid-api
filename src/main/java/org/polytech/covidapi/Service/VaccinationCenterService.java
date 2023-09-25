package org.polytech.covidapi.Service;

import java.util.List;

import org.polytech.covidapi.Model.VaccinationCenter;
import org.polytech.covidapi.Repository.VaccinationCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationCenterService {

    @Autowired
    private VaccinationCenterRepository vaccinationCenterRepository;

    public Iterable<VaccinationCenter> getVaccinationCenter() {
        return vaccinationCenterRepository.findAll();
    }

    public void save(VaccinationCenter vaccinationCenter) {
        vaccinationCenterRepository.save(vaccinationCenter);

    }

    public void delete(long id) {
        vaccinationCenterRepository.deleteById(id);
    }

    public void update(VaccinationCenter vaccinationCenter) {

        if (vaccinationCenterRepository.existsById(vaccinationCenter.getId())) {
            vaccinationCenterRepository.save(vaccinationCenter);
        } 

    }

    public List<VaccinationCenter> findVaccinationCentersByCityLike(String city) {
        return vaccinationCenterRepository.findAllByCityLike(city);
    }

}
