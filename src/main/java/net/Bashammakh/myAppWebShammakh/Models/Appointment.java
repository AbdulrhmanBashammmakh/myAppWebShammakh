package net.Bashammakh.myAppWebShammakh.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Setter
@Getter
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
    private Date appointment_day;

    @ManyToOne(optional=false)
    @JoinColumn(name="Doctor_ID", nullable=false, updatable=false)
    private Doctor doctors;

    @ManyToOne(optional=false)
    @JoinColumn(name="Patient_ID", nullable=false, updatable=false)
    private Patient patient;

}
