package org.polytech.covidapi.Controller;

import org.polytech.covidapi.Model.VaccinationCenter;
import org.polytech.covidapi.Service.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/vaccination-center")
public class VaccinationCenterController {
    @Autowired
    private VaccinationCenterService vaccinationCenterService;

    @GetMapping(path = "/All-center")
    @ResponseBody
    public Iterable<VaccinationCenter> GetAllVaccinationCenter() {
        return vaccinationCenterService.getVaccinationCenter();
    }

    @GetMapping(path = "/By-City")
    @ResponseBody
    public Iterable<VaccinationCenter> GetVaccinationCenterByCity(
            @RequestParam(name = "city", required = false) String city) {
        if (city != null) {
            return vaccinationCenterService.findVaccinationCentersByCityLike(city);

        } else {
            return null;
        }

    }

}