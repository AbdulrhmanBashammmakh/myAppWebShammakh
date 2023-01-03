package net.Bashammakh.myAppWebShammakh.Models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter


public class Specialty {
    public Specialty() {
        super();
    }

    public Specialty(final String SpecialtyName) {
        super();
        this.SpecialtyName = SpecialtyName;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
    private String SpecialtyName;
/*
    @OneToMany(mappedBy = "parentdoctor") // mappedBy indicates that this side is the
    // inverse side, and that the mapping is defined by the attribute parentOrder
    // at the other side of the association.
    private Set<Doctor> doctors;

 */
}
