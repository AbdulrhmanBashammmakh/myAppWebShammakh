package net.Bashammakh.myAppWebShammakh.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Reception {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID ;
    private String status;

}
