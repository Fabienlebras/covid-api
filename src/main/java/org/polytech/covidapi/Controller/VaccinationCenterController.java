package org.polytech.covidapi.Controller;

import org.polytech.covidapi.Model.VaccinationCenter;
import org.polytech.covidapi.Service.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/vaccination-center") // Use a different base path to avoid conflicts
public class VaccinationCenterController {
    @Autowired
    private VaccinationCenterService vaccinationCenterService;

    @GetMapping(value = "/All-center")
    @ResponseBody // Use this annotation to return data directly, assuming you want JSON data
    public Iterable<VaccinationCenter> list() {
        return vaccinationCenterService.getVaccinationCenter();
    }

}