package net.Bashammakh.myAppWebShammakh.Repos;

import net.Bashammakh.myAppWebShammakh.Models.User.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolesRepository extends JpaRepository<Roles,Long> {
}
