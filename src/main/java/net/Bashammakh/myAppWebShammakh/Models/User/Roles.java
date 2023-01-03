package net.Bashammakh.myAppWebShammakh.Models.User;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity
@Setter
@Getter
@Builder

public class Roles {

    public Roles() {
        super();
    }

    public Roles(final String name) {
        super();
        this.name = name;
    }

 @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String name;
    @ManyToMany(mappedBy = "roles")
    private Collection<Users> users;

    @ManyToMany
    @JoinTable(
            name = "roles_privileges",
            joinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "privilege_id", referencedColumnName = "id"))
    private Collection<Privileges> privileges;
}