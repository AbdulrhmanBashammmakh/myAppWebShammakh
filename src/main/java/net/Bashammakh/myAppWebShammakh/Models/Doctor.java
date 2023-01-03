package net.Bashammakh.myAppWebShammakh.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

import static jakarta.persistence.CascadeType.ALL;


@Entity
@Setter
@Getter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    private String DoctorName ;

    private double fees ;
    private double contract_rate ;


    @ManyToOne(optional=false)
    @JoinColumn(name="specialty_ID", nullable=false, updatable=false)
    private Specialty specialty;


}
