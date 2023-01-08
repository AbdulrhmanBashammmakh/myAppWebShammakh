package net.Bashammakh.myAppWebShammakh.Models;


import jakarta.persistence.*;
import lombok.*;



@Entity
public class Specialty {
  /*
    public Specialty() {
        super();
    }

    public Specialty(final String SpecialtyName) {
        super();
        this.SpecialtyName = SpecialtyName;
    }

   */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
    @Column()
    private String SpecialtyName;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getSpecialtyName() {
        return SpecialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        SpecialtyName = specialtyName;
    }
}
