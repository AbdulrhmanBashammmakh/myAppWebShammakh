package net.Bashammakh.myAppWebShammakh.Controllers;


import net.Bashammakh.myAppWebShammakh.Models.Specialty;
import net.Bashammakh.myAppWebShammakh.Services.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/Specialty")
public class SpecialtyController {


    @Autowired
    SpecialtyService specialtyService;

    @GetMapping(value="/all")
    public List<Specialty> all(){
        return specialtyService.getSpecialties();
    }


}
