package net.Bashammakh.myAppWebShammakh.Models;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Builder
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
}
