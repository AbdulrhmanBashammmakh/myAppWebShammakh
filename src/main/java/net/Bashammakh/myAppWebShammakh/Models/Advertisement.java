package net.Bashammakh.myAppWebShammakh.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;

    @ManyToOne(optional=false)
    @JoinColumn(name="Doctor_ID", nullable=false, updatable=false)
    private Doctor doctors;


}
