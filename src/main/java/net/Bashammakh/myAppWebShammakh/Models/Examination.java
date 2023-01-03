package net.Bashammakh.myAppWebShammakh.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Examination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
    private String Exam_title;
    private String Exam_code;
    private String note;


    @ManyToOne(optional=false)
    @JoinColumn(name="Checked_ID", nullable=false, updatable=false)
    private Checked checked;
}
