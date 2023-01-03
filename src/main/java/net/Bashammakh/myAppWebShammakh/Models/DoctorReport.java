package net.Bashammakh.myAppWebShammakh.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class DoctorReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
    private String report;
    private String note;

    @ManyToOne(optional=false)
    @JoinColumn(name="Checked_ID", nullable=false, updatable=false)
    private Checked checked;
}
