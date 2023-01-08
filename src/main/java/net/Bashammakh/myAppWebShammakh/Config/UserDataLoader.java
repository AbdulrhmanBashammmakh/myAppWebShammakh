package net.Bashammakh.myAppWebShammakh.Config;

import net.Bashammakh.myAppWebShammakh.Models.Specialty;
import net.Bashammakh.myAppWebShammakh.Models.User.Roles;
import net.Bashammakh.myAppWebShammakh.Models.User.Users;
import net.Bashammakh.myAppWebShammakh.Repos.RolesRepository;
import net.Bashammakh.myAppWebShammakh.Repos.SpecialtyRepository;
import net.Bashammakh.myAppWebShammakh.Repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDataLoader implements CommandLineRunner {
    @Autowired
    RolesRepository rolesRepository;

    @Autowired
    SpecialtyRepository specialtyRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        loadUserData();
    }
    private void loadUserData() {
        if (rolesRepository.count() == 0) {
            Roles role1 = new Roles("Admin-role");
            Roles role2 = new Roles("Employee-role");
            Roles role3 = new Roles("Doctor-role");
            Roles role4 = new Roles("Patient-role");


           // rolesRepository.save();
            rolesRepository.save(role1);
            rolesRepository.save(role2);
            rolesRepository.save(role3);
            rolesRepository.save(role4);

        }
        System.out.println(rolesRepository.count());
        /*
        if (specialtyRepository.count() == 0){
            Specialty specialty =new Specialty();
            specialty.setSpecialtyName("General");
            specialtyRepository.save(specialty);
        }
        System.out.println(specialtyRepository.count());

         */
        if (userRepository.count() == 0){
           Users Admin =new Users("Admin","Admin","Ad@ad.com","123456","773886998",true,false);
            userRepository.save(Admin);
        }
        System.out.println(userRepository.count());
    }

}
