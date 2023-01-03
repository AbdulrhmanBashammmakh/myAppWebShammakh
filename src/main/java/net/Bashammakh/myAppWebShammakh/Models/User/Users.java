package net.Bashammakh.myAppWebShammakh.Models.User;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity
@Setter
@Getter
public class Users {
    public Users(){
        super();
    }
    public Users(final String firstName,final String lastName,final String email ,final String password
            ,final String PhoneNum ,final boolean enabled ,final boolean tokenExpired){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.PhoneNum = PhoneNum;
        this.enabled = enabled;
        this.tokenExpired = tokenExpired;


    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String PhoneNum;
    private boolean enabled;
    private boolean tokenExpired;

    /*
    @UUID
    private String uuid;
*/

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Roles> roles;

}
