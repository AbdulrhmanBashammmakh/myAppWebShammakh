package net.Bashammakh.myAppWebShammakh.Controllers;


import net.Bashammakh.myAppWebShammakh.Models.Specialty;
import net.Bashammakh.myAppWebShammakh.Services.MainServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Specialty")
public class SpecialtyController {


    @Autowired
    private  MainServ specialtyService;

    public SpecialtyController(MainServ specialtyService) {
        this.specialtyService = specialtyService;
    }


    @GetMapping(value="/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Specialty> all(){
        return specialtyService.getSpecialties();
    }


}
