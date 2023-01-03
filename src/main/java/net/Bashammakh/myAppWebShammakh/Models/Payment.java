package net.Bashammakh.myAppWebShammakh.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
    private double fees;

    @ManyToOne(optional=false)
    @JoinColumn(name="Employee_ID", nullable=false, updatable=false)
    private Employee employee;


    @ManyToOne(optional=false)
    @JoinColumn(name="Appointment_ID", nullable=false, updatable=false)
    private Appointment appointment;
}
