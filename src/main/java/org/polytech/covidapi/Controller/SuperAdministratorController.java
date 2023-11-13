package org.polytech.covidapi.Controller;
import org.polytech.covidapi.Service.SuperAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/SuperAdministrator")
public class SuperAdministratorController {
    @Autowired
    private SuperAdministratorService superAdministratorService;
}