package net.Bashammakh.myAppWebShammakh.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
public class Checked {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
    private Date date_Checked ;

    @ManyToOne(optional=false)
    @JoinColumn(name="HealthRecordID", nullable=false, updatable=false)
    private HealthRecord healthRecord;


    @ManyToOne(optional=false)
    @JoinColumn(name="Reception_ID", nullable=false, updatable=false)
    private Reception reception;
}
