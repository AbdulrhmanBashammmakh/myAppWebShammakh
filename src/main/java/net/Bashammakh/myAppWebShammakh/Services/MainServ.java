package net.Bashammakh.myAppWebShammakh.Services;

import net.Bashammakh.myAppWebShammakh.Models.Specialty;
import net.Bashammakh.myAppWebShammakh.Repos.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServ {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    public List<Specialty> getSpecialties(){

        List<Specialty> Specialies = this.specialtyRepository.findAll();


        return Specialies;
    }

}
