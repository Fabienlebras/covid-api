package org.polytech.covidapi.Controller;
import org.polytech.covidapi.Model.Vaccination;
import org.polytech.covidapi.Service.VaccinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/vaccination")
public class VaccinationController {
    @Autowired
    private VaccinationService vaccinationService;

    @GetMapping(path = "/All-vaccination")
    @ResponseBody
    public Iterable<Vaccination> GetAllVaccination() {
        return vaccinationService.getVaccination();
    }

}